package ru.geekbrains.sringsecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.sringsecurity.entities.Authorities;

@Repository
public interface AuthoritiesRepository extends CrudRepository<Authorities, Long> {
}
