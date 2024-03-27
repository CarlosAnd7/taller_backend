package com.example.project.services;

import com.example.project.model.Cliente;
import org.springframework.http.ResponseEntity;
import com.example.project.response.ClienteResponseRest;

public interface IntClienteService {
    public ResponseEntity<ClienteResponseRest> search();
    public ResponseEntity<ClienteResponseRest> searchByID(Long ID);

    public ResponseEntity<ClienteResponseRest>save(Cliente cliente);

    public ResponseEntity<ClienteResponseRest>update(Cliente cliente, Long ID);

}
