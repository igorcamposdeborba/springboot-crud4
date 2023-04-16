package com.igor.firstapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igor.firstapi.domain.Users;


public interface UsersRepository extends JpaRepository<Users, Integer>{

}
