package Project.Aida.Reto_3.crud;


import Project.Aida.Reto_3.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}