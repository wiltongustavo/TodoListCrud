package cap.com.br.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cap.com.br.model.TodoListModel;
import cap.com.br.repository.TodoListRepository;

@RestController
public class TodoListController {

	@Autowired
	TodoListRepository todoListRepository;

	@PostMapping("/todolist")
	TodoListModel adicionar(@Valid @RequestBody TodoListModel todoListModel) {
		return todoListRepository.save(todoListModel);
	}

	@GetMapping("/todolist")
	public Iterable<TodoListModel> listar() {
		return todoListRepository.findAll();
	}

	@GetMapping("/todolist/{id}")
	Optional<TodoListModel> findById(@PathVariable long id) {
		return todoListRepository.findById(id);
	}

	@PutMapping("/todolist/{id}")
	ResponseEntity<TodoListModel> atualizar(@PathVariable Long id, @RequestBody TodoListModel todoListModel) {

		if (todoListRepository.findById(id).isPresent()) {
			todoListModel.setId(id);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(todoListRepository.save(todoListModel));
			
		} else {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/todolist/{id}")
	void delete(@PathVariable Long id) {
		todoListRepository.deleteById(id);
	}

}
