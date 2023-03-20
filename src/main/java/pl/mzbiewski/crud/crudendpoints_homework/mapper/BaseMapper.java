package pl.mzbiewski.crud.crudendpoints_homework.mapper;

import org.mapstruct.factory.Mappers;

public interface BaseMapper<E,D> {

    E toEntity(D dto);

    D toDTO(E entity);

}
