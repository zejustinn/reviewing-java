package br.com.jlsj.sprinhibernate.springAndHibernate.model.repositories;

import br.com.jlsj.sprinhibernate.springAndHibernate.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
