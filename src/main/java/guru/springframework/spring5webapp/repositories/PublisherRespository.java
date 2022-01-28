package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by @author issaclee725 on 28/01/2022
 */
public interface PublisherRespository extends CrudRepository<Publisher, Long> {
}
