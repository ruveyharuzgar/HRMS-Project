package javacamp.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
