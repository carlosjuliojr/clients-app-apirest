package com.carlosjuliojr.clientapp.apirest.models.services;

import com.carlosjuliojr.clientapp.apirest.models.entity.Client;

import java.util.List;

public interface IClientService {

    public List<Client> findAll();
}
