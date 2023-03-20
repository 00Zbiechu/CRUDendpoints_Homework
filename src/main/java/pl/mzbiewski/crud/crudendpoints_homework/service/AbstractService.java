package pl.mzbiewski.crud.crudendpoints_homework.service;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import pl.mzbiewski.crud.crudendpoints_homework.mapper.BaseMapper;
import pl.mzbiewski.crud.crudendpoints_homework.validator.BaseValidator;

import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractService<E,D>{


    protected abstract JpaRepository<E,Long> getRepository();

    protected abstract BaseValidator<D> getValidator();

    protected abstract BaseMapper<E,D> getMapper();


    public List<D> get() {
        return getRepository().findAll().stream().map(getMapper()::toDTO).collect(Collectors.toList());
    }

    public void create(D dto){
        getRepository().save(getMapper().toEntity(dto));
    }

    public void update(Long id,D dto){
        getRepository().deleteById(id);
        getRepository().save(getMapper().toEntity(dto));
    }

    public void delete(D dto){
        getRepository().delete(getMapper().toEntity(dto));
    }


}
