package pl.mzbiewski.crud.crudendpoints_homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mzbiewski.crud.crudendpoints_homework.entity.RoleEntity;

@Repository
public interface RoleRepository extends BaseRepository<RoleEntity> {
}
