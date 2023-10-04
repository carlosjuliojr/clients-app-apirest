package com.carlosjuliojr.clientapp.apirest.models.services;

import com.carlosjuliojr.clientapp.apirest.models.dao.IClientDao;
import com.carlosjuliojr.clientapp.apirest.models.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClientServiceImpl implements IClientService{


    @Autowired
    private IClientDao clientDao;

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return (List<Client>) clientDao.findAll();
    }

}
