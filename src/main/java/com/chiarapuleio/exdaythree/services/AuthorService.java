package com.chiarapuleio.exdaythree.services;

import com.chiarapuleio.exdaythree.dao.AuthorDAO;
import com.chiarapuleio.exdaythree.entities.Author;
import com.chiarapuleio.exdaythree.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorService {
    @Autowired
    private AuthorDAO authorDao;

    public List<Author> getAuthors(){
        return this.authorDao.findAll();
    }


    public Author saveAuthor(Author newAuthor) {
        if(this.authorDao.existsByEmail(newAuthor.getEmail())){
            throw new RuntimeException("Author email " + newAuthor.getEmail() + " already exist.");
        } else {
            authorDao.save(newAuthor);
        }
        return newAuthor;
    }

    public Author findById(UUID id) {
        return authorDao.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Author findByIdAndUpdate(UUID id, Author newAuthor) {
        Author found = this.findById(id);
        found.setName(newAuthor.getName());
        found.setSurname(newAuthor.getSurname());
        found.setEmail(newAuthor.getEmail());
        found.setAvatarUrl(newAuthor.getAvatarUrl());
        found.setDateOfBirth(newAuthor.getDateOfBirth());
        return authorDao.save(newAuthor);
    }

    public void findByIdAndDelete(UUID id) {
        Author found = this.findById(id);
        authorDao.delete(found);
    }
}
