package fr.demo.quarkus.repository;

import java.util.List;

import fr.demo.quarkus.model.Todo;

public interface TodoRepository {

	List<Todo> getAll();

	void create(Todo todo);

	void delete(Long id);

}
