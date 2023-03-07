package pl.mzbiewski.crud.crudendpoints_homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mzbiewski.crud.crudendpoints_homework.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
}
