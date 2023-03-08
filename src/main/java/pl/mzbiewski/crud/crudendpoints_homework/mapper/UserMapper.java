package pl.mzbiewski.crud.crudendpoints_homework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.mzbiewski.crud.crudendpoints_homework.entity.UserEntity;
import pl.mzbiewski.crud.crudendpoints_homework.model.UserDTO;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity toEntity(UserDTO dto);

    UserDTO toDTO(UserEntity entity);

}
