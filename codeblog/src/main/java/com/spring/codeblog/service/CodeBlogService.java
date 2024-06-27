package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;

import java.util.List;

public interface CodeBlogService {
/*
* Metodo 1 - Retornar lista de posts
* Metodp 2 - Retornar um unico post
* Metodo 3 - Salvar mo banco de dados
*/
    List<Post> findAll(); /* Retornar lista de posts*/
    Post findById(long id);
    Post save (Post post);
}
