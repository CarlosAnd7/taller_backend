package com.example.project.services;

import com.example.project.DAO.IntClienteDAO;
import com.example.project.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.project.response.ClienteResponseRest;

import java.util.List;

@Service
public class ClienteServiceImp implements IntClienteService{
    @Autowired
    private IntClienteDAO clienteDAO;

    @Override
    @Transactional(readOnly = true)
    public ResponseEntity<ClienteResponseRest> search() {
        ClienteResponseRest response = new ClienteResponseRest();
        try {
            List<Cliente> clientes = (List<Cliente>) clienteDAO.findAll();
            response.getClientResponse().setCliente(clientes);
            response.setMetadata("Respuesta ok", "00", "Respuesta Exitosa");
        }catch (Exception e){
            response.setMetadata("Sin respuesta", "-1", "Error a consultar");
            e.getStackTrace();
            return new ResponseEntity<ClienteResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<ClienteResponseRest>(response, HttpStatus.OK);
    }
}
