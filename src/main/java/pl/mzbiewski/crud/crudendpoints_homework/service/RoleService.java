package pl.mzbiewski.crud.crudendpoints_homework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pl.mzbiewski.crud.crudendpoints_homework.entity.RoleEntity;
import pl.mzbiewski.crud.crudendpoints_homework.mapper.BaseMapper;
import pl.mzbiewski.crud.crudendpoints_homework.mapper.RoleMapper;
import pl.mzbiewski.crud.crudendpoints_homework.model.RoleDTO;
import pl.mzbiewski.crud.crudendpoints_homework.repository.RoleRepository;
import pl.mzbiewski.crud.crudendpoints_homework.validator.BaseValidator;
import pl.mzbiewski.crud.crudendpoints_homework.validator.RoleValidator;

@Service
@RequiredArgsConstructor
public class RoleService extends AbstractService<RoleEntity, RoleDTO> {

    private final RoleRepository repository;
    private final RoleValidator roleValidator;

    private final RoleMapper roleMapper;

    @Override
    protected JpaRepository<RoleEntity, Long> getRepository() {
        return repository;
    }

    @Override
    protected BaseValidator<RoleDTO> getValidator() {
        return roleValidator;
    }

    @Override
    protected BaseMapper<RoleEntity, RoleDTO> getMapper() {
        return roleMapper;
    }
}
