package pl.mzbiewski.crud.crudendpoints_homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import pl.mzbiewski.crud.crudendpoints_homework.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity<T>> extends JpaRepository<T,Long> {
}
