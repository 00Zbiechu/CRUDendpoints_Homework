package pl.mzbiewski.crud.crudendpoints_homework.service;


import pl.mzbiewski.crud.crudendpoints_homework.entity.BaseEntity;

import pl.mzbiewski.crud.crudendpoints_homework.mapper.UserMapper;
import pl.mzbiewski.crud.crudendpoints_homework.model.BaseDTO;
import pl.mzbiewski.crud.crudendpoints_homework.repository.BaseRepository;
import pl.mzbiewski.crud.crudendpoints_homework.validator.BaseValidator;

import java.util.List;


public abstract class AbstractService<E extends BaseEntity<E>,D extends BaseDTO<D>>{

    private final BaseRepository<E> repository;

    public AbstractService(BaseRepository<E> repository, BaseValidator<D> validator) {
        this.repository = repository;
    }



    public List<E> get(){
        return repository.findAll();
    }

    public void create(E entity){
        repository.save(entity);
    }

    public void update(Long id, E entity){
        repository.delete(repository.findById(id).get());
        repository.save(entity);

    }

    public void delete(Long id){
        repository.delete(repository.findById(id).get());
    }




}
