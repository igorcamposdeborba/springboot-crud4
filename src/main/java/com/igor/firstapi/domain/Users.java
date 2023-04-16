package com.igor.firstapi.domain;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;


@Entity
public class Users implements Serializable {
	private static final long serialVersionUID = 1L; // converte em bytes (serializable) para no banco de dados ele desserializar 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // IDENTITY usa a coluna ID do banco de dados preenchido internamente
	private Integer id;
	
	@NotEmpty(message = "Field NAME is mandatory")
	@Length(min = 3, max = 100, message = "Minimum 3 characters")
	private String name;
	
	@NotEmpty(message = "Field LOGIN is mandatory")
	private String login;
	
	@NotEmpty(message = "Field PASSWORD is mandatory")
	@Length(min = 3, max = 50, message = "Minimum 6 characters")
	private String password;
	
	
	public Users () {
		super();
	}
	public Users (Integer id, String name, String login, String password) {
		this.id = id;
		this.name = name;
		this.login = login;
		this.password = password;
	}
	
	// Access methods
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(id, other.id);
	}

}
