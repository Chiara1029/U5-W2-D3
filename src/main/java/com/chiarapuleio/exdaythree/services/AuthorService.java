package com.chiarapuleio.exdaythree.services;

import com.chiarapuleio.exdaythree.dao.AuthorDAO;
import com.chiarapuleio.exdaythree.entities.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class AuthorService {
    @Autowired
    private AuthorDAO authorDao;


//    public List<Author> authors = new ArrayList<>();
//
//    public List<Author> getAllAuthors() {
//        return this.authors;
//    }
//
//    public Author saveAuthor(Author newAuthor) {
//        Random rnd = new Random();
//        newPost.setId(rnd.nextInt(1, 10));
//        this.authors.add(newAuthor);
//        return newAuthor;
//    }
//
//    public Author findById(int id) {
//        Author found = null;
//        for (Author author : this.authors) {
//            if (author.getId() == id) {
//                found = author;
//            }
//        }
//        return found;
//    }
//
//    public Author findByIdAndUpdate(int id, Author newAuthor) {
//        Author found = null;
//        for (Author author : this.authors) {
//            if (author.getId() == id) {
//                found = author;
//                found.setCategory(newPost.getCategory());
//                found.setTitle(newPost.getTitle());
//                found.setCover(newPost.getCover());
//                found.setContent(newPost.getContent());
//                found.setReadingTime(newPost.getReadingTime());
//            }
//        }
//        if (found == null) throw new RuntimeException();
//        else return found;
//    }
//
//    public void findByIdAndDelete(int id) {
//        Iterator<Author> i = this.authors.iterator();
//        while (i.hasNext()) {
//            Author current = i.next();
//            if (current.getId() == id) {
//                i.remove();
//            }
//        }
//    }
}
