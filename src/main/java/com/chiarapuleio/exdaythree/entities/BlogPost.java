package com.chiarapuleio.exdaythree.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="blog_posts")
public class BlogPost {
    @Id
    @GeneratedValue
    private UUID id;
    private String category;
    private String title;
    private String coverUrl;
    private String content;
    private int readingTime;
    private Author author;

    public BlogPost(String category, String title, String coverUrl, String content, int readingTime, Author author) {
        this.category = category;
        this.title = title;
        this.coverUrl = coverUrl;
        this.content = content;
        this.readingTime = readingTime;
        this.author = author;
    }
}