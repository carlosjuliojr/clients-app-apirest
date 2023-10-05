package com.carlosjuliojr.clientapp.apirest.models.services;

import com.carlosjuliojr.clientapp.apirest.models.entity.Client;

import java.util.List;

public interface IClientService {

    public List<Client> findAll();

    public Client findById(Long id);
    public Client save(Client client);
    public void delete(Long id);
}
