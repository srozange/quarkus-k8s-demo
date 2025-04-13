package fr.demo.quarkus.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.enterprise.context.ApplicationScoped;

import fr.demo.quarkus.model.Todo;

@ApplicationScoped
public class InMemoryTodoRepository implements TodoRepository {

	private final List<Todo> todos = Collections.synchronizedList(new ArrayList<>());
	private final AtomicLong atomicLong = new AtomicLong();

	@Override
	public List<Todo> getAll() {
		return todos;
	}

	@Override
	public void create(Todo todo) {
		todo.id = atomicLong.getAndIncrement();
		todos.add(todo);
	}

	@Override
	public void delete(Long id) {
		todos.stream().filter(t -> t.id.equals(id)).findFirst().ifPresent(todos::remove);
	}

}
