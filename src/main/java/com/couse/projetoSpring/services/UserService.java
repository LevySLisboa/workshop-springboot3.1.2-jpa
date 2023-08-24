package com.couse.projetoSpring.services;

import com.couse.projetoSpring.entities.User;
import com.couse.projetoSpring.repositories.UserRepository;
import com.couse.projetoSpring.services.exceptions.DatabaseException;
import com.couse.projetoSpring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow( ()->new ResourceNotFoundException(id) );
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id) {
        try {
            User user = findById(id);
            repository.delete(user);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User uptade(Long id,User obj){
        User entity = repository.getReferenceById(id);
        uptadeData(entity,obj);
        return repository.save(entity);
    }

    private void uptadeData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
