package arquiteturaspring.model.todo;

import org.springframework.stereotype.Component;

@Component
public class TodoValidation {
	private TodoRepository repository;

	public TodoValidation(TodoRepository repository) {
		this.repository = repository;
	}
	
	public void validar(TodoEntity todoEntity) {
		if(existeTodoComDescricao(todoEntity.getDescricao())) {
			throw new IllegalArgumentException("Já tem uma descricao registrado!");
		}
	}

	private boolean existeTodoComDescricao(String descricao) {
		
		return repository.existsByDescricao(descricao);
	}
	
	

}
