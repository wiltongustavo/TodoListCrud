package cap.com.br.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cap.com.br.model.TodoListModel;

@Repository
public interface TodoListRepository extends JpaRepository<TodoListModel, Long>{

	
	Optional<TodoListModel> findById(String id);
	

}
