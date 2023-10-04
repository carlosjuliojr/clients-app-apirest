package com.carlosjuliojr.clientapp.apirest.models.dao;

import com.carlosjuliojr.clientapp.apirest.models.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository <Client, Long> {

}
