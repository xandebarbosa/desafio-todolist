package com.alexandre.desafio_todolist.repository;

import com.alexandre.desafio_todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

/*REPOSITORY
Interage com o banco de dados, criando, atualizando e deletando tabelas.
Os repositórios sempre serão interfaces que estendem de um uma interface fornecida pelo próprio
Spring, como exemplo vamos utilizar JPARepository, no generecis informamos a entity e o tipo do
id da entity*/
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
