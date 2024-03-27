package com.example.project.DAO;

import com.example.project.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IntClienteDAO extends CrudRepository<Cliente, Long> {

}
