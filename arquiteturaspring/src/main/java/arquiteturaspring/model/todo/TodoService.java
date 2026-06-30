package arquiteturaspring.model.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private TodoRepository todoRepository;
	
	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public TodoEntity salvar(TodoEntity novoTodo) {
		return todoRepository.save(novoTodo);
	}

	public TodoEntity buscaPorId(Long id) {
		return todoRepository.findById(id).get();
	}

	public TodoEntity atualizar(Long id, TodoEntity obj) {
		obj.setId(id);
		
		return todoRepository.save(obj);
	}
}
