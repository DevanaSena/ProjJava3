package com.spring.codeblog.repository;

import com.spring.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* Exportar o Jpa para utilizar os metodos spring (save,delete,update...)
* para utilizar no banco de dados
* Consultar o psql para validar se as tabelas foram criadas tudo ok.
* */

public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
