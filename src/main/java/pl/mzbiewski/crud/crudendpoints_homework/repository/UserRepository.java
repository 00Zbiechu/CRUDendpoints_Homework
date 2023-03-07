package pl.mzbiewski.crud.crudendpoints_homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mzbiewski.crud.crudendpoints_homework.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
