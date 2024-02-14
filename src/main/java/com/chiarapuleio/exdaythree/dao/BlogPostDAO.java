package com.chiarapuleio.exdaythree.dao;

import com.chiarapuleio.exdaythree.entities.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BlogPostDAO extends JpaRepository<BlogPost, UUID> {
}
