package com.Lisboa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lisboa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
