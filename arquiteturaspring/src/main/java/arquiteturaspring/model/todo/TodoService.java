package arquiteturaspring.model.todo;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private TodoRepository todoRepository;
	private MailSender mailSender;
	private TodoValidation todoValidation;
	
	
	
	public TodoService(TodoRepository todoRepository, MailSender mailSender, TodoValidation todoValidation) {
		super();
		this.todoRepository = todoRepository;
		this.mailSender = mailSender;
		this.todoValidation = todoValidation;
	}

	public TodoEntity salvar(TodoEntity novoTodo) {
		todoValidation.validar(novoTodo);
		return todoRepository.save(novoTodo);
	}

	public TodoEntity buscaPorId(Long id) {
		return todoRepository.findById(id).get();
	}

	public TodoEntity atualizar(Long id, TodoEntity obj) {
		obj.setId(id);
		String status = obj.getConcluido() == Boolean.TRUE ? "Concluido!!" : "Não concluido";
		mailSender.enviar("informações foram atualizada Status: "+status);
		
		return todoRepository.save(obj);
	}
}
