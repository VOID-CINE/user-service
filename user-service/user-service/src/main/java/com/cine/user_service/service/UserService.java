package com.cine.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cine.user_service.model.User;
import com.cine.user_service.repository.UserRepository;

@Service

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // CREACIÓN DE USUARIO
    public User create(User user) {

        return repository.save(user);
    }

    // OBTENER TODOS LOS USUARIOS
    public List<User> getAll() {

        return repository.findAll();
    }

    // OBTENER USUARIOS POR ID
    public User getById(Long id) {

        return repository.findById(id).orElseThrow();
    }

    // ELIMINAR USUARIO
    public void delete(Long id) {

        repository.deleteById(id);
    }
}
