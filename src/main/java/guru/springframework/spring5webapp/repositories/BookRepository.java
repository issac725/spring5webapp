package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by @author issaclee725 on 27/01/2022
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
