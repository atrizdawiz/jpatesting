package se.andreasostling.jpatesting.repositories;

import org.springframework.data.repository.CrudRepository;
import se.andreasostling.jpatesting.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
