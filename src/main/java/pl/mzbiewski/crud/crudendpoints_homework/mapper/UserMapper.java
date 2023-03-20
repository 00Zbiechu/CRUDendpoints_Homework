package pl.mzbiewski.crud.crudendpoints_homework.mapper;

import org.mapstruct.Mapper;
import pl.mzbiewski.crud.crudendpoints_homework.entity.UserEntity;
import pl.mzbiewski.crud.crudendpoints_homework.model.UserDTO;

@Mapper(uses = UserMapper.class, componentModel = "spring")
public interface UserMapper extends BaseMapper<UserEntity, UserDTO>{
}
