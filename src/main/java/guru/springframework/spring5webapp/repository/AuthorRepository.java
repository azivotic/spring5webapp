package guru.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Author;

/**
 * @author Aleksandar Zivotic
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
