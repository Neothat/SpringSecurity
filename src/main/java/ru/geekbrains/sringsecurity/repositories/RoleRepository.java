package ru.geekbrains.sringsecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.sringsecurity.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
