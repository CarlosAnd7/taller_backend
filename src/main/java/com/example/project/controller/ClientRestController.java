package com.example.project.controller;

import com.example.project.response.ClienteResponseRest;
import com.example.project.services.IntClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClientRestController {
    @Autowired
    private IntClienteService service;

    @GetMapping("/clientes")
    public ResponseEntity<ClienteResponseRest> searchClientes(){

        ResponseEntity<ClienteResponseRest> response = service.search();
        return response;
    }
}
