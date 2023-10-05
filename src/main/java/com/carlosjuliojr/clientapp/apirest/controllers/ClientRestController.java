package com.carlosjuliojr.clientapp.apirest.controllers;

import com.carlosjuliojr.clientapp.apirest.models.entity.Client;
import com.carlosjuliojr.clientapp.apirest.models.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping("/clients/{id}")
    public Client getClientById(@PathVariable Long id){
        return iClientService.findById(id);
    }

    @PostMapping("/clients")
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(@RequestBody Client client){
        client.setCreateAt(new Date());
        return iClientService.save(client);
    }

    @PutMapping("/clients/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Client updateClient(@RequestBody Client client, @PathVariable Long id){
        Client client1 =  iClientService.findById(id);
        client1.setName(client.getName());
        client1.setLastName(client.getLastName());
        client1.setEmail(client.getEmail());
        client1.setCreateAt(client.getCreateAt());
        return iClientService.save(client1);
    }
    @DeleteMapping("/clients/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClientById(@PathVariable Long id){
         iClientService.delete(id);
    }

}
