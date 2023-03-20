package pl.mzbiewski.crud.crudendpoints_homework.mapper;

import org.mapstruct.Mapper;
import pl.mzbiewski.crud.crudendpoints_homework.entity.RoleEntity;
import pl.mzbiewski.crud.crudendpoints_homework.model.RoleDTO;

@Mapper(uses = RoleMapper.class, componentModel = "spring")
public interface RoleMapper extends BaseMapper<RoleEntity, RoleDTO> {
}
