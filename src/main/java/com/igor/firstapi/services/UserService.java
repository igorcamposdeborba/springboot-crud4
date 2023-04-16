package com.igor.firstapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igor.firstapi.domain.Users;
import com.igor.firstapi.repositories.UsersRepository;
import com.igor.firstapi.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UsersRepository repository;
	
	public Users findById(Integer id) {
		Optional<Users> obj = repository.findById(id); // JPA já tem os métodos implementados que eu extends no Repository
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. Id: " + id + ", Tipo " + Users.class.getName()));
	}
	
	public List<Users> findAll(){
		return repository.findAll(); // JPA já tem os métodos implementados
	}

	public Users update(Integer id, Users obj) {
		Users newObj = findById(id);
		newObj.setName(obj.getName());
		newObj.setLogin(obj.getLogin());
		newObj.setPassword(obj.getPassword());
		
		return repository.save(newObj);
	}

	public Users create(Users obj) {
		obj.setId(null);
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}
	
}
