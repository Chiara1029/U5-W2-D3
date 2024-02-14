package com.chiarapuleio.exdaythree.dao;

import com.chiarapuleio.exdaythree.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorDAO extends JpaRepository<Author, UUID> {
    boolean existsByEmail(String email);
}
