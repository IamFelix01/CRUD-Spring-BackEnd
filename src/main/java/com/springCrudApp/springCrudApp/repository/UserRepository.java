package com.springCrudApp.springCrudApp.repository;

import com.springCrudApp.springCrudApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
