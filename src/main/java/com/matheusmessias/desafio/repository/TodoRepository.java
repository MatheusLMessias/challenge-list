package com.matheusmessias.desafio.repository;

import com.matheusmessias.desafio.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
