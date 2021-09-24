package cap.com.br.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;


import cap.com.br.model.TodoListModel;

@RepositoryRestController
public interface TodoListRepository extends JpaRepository<TodoListModel, Long>{

	
	Optional<TodoListModel> findById(String id);
	

}
