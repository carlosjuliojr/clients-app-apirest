package com.carlosjuliojr.clientapp.apirest.controllers;

import com.carlosjuliojr.clientapp.apirest.models.entity.Client;
import com.carlosjuliojr.clientapp.apirest.models.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClientRestController {

    @Autowired
    private IClientService iClientService;

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return iClientService.findAll();
    }
}
