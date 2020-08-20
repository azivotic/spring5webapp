package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Publisher;

/**
 * @author Aleksandar Zivotic
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
