package com.example.project.controller;

import com.example.project.model.Cliente;
import com.example.project.response.ClienteResponseRest;
import com.example.project.services.IntClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
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

    @GetMapping("/clientes/{ID}")
    public ResponseEntity<ClienteResponseRest> searchClientesID(@PathVariable Long ID){

        ResponseEntity<ClienteResponseRest> response = service.searchByID(ID);
        return response;
    }

    @PostMapping("/clientes")
    public ResponseEntity<ClienteResponseRest> save(@RequestBody Cliente cliente){

        ResponseEntity<ClienteResponseRest> response = service.save(cliente);
        return response;
    }

    @PutMapping("/clientes/{ID}")
    public ResponseEntity<ClienteResponseRest> update(@RequestBody Cliente cliente, @PathVariable Long ID){

        ResponseEntity<ClienteResponseRest> response = service.update(cliente, ID);
        return response;
    }

    @DeleteMapping("/clientes/{ID}")
    public ResponseEntity<ClienteResponseRest> delete(@PathVariable Long ID){
        ResponseEntity<ClienteResponseRest> response = service.deleteByID(ID);
        return response;
    }
}
