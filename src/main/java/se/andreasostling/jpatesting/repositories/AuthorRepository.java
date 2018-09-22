package se.andreasostling.jpatesting.repositories;

import org.springframework.data.repository.CrudRepository;
import se.andreasostling.jpatesting.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
