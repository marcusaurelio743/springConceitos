package arquiteturaspring.model.todo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/todos")
public class TodoController {
	
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@PostMapping
	public TodoEntity salvar(@RequestBody TodoEntity entity) {
		try {
			return todoService.salvar(entity);
		}catch (IllegalArgumentException e) {
			String mensagem = e.getMessage();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,mensagem);
		}
		
	}
	
	@GetMapping("/{id}")
	public TodoEntity buscaId(@PathVariable Long id) {
		return todoService.buscaPorId(id);
	}
	
	@PutMapping("/{id}")
	public TodoEntity atualizar(@PathVariable Long id, @RequestBody TodoEntity obj) {
		return todoService.atualizar(id,obj);
	}
	
	
}
