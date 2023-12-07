package com.example.crudone.repositories;

import com.example.crudone.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <UserModel, Long>{

}
