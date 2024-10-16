package com.dziombra.desafioCliente.services;

import com.dziombra.desafioCliente.dto.ClientDTO;
import com.dziombra.desafioCliente.entities.Client;
import com.dziombra.desafioCliente.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById (Long id) {
        Client client = repository.findById(id).orElseThrow();
        return new ClientDTO(client);
    }



}
