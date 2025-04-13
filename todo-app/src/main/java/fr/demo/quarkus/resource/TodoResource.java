package fr.demo.quarkus.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.demo.quarkus.model.Todo;
import fr.demo.quarkus.repository.TodoRepository;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

	private TodoRepository todoRepository;

	public TodoResource(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	@GET
	public List<Todo> getAll() {
		return todoRepository.getAll();
	}

	@POST
	@Transactional
	public void create(Todo todo) {
		todoRepository.create(todo);
	}

	@DELETE
	@Transactional
	@Path("{id}")
	public void delete(@PathParam("id") Long id) {
		todoRepository.delete(id);
	}

}
