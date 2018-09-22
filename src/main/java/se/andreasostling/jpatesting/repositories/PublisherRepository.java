package se.andreasostling.jpatesting.repositories;

import org.springframework.data.repository.CrudRepository;
import se.andreasostling.jpatesting.model.Publisher;

public interface  PublisherRepository extends CrudRepository<Publisher, Long> {
}
