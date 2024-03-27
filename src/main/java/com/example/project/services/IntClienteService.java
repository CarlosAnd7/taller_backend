package com.example.project.services;

import org.springframework.http.ResponseEntity;
import com.example.project.response.ClienteResponseRest;

public interface IntClienteService {
    public ResponseEntity<ClienteResponseRest> search();

}
