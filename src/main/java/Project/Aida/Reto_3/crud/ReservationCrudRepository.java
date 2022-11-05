package Project.Aida.Reto_3.crud;

import Project.Aida.Reto_3.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
