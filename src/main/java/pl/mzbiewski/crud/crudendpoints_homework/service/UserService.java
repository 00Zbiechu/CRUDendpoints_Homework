package pl.mzbiewski.crud.crudendpoints_homework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pl.mzbiewski.crud.crudendpoints_homework.entity.UserEntity;
import pl.mzbiewski.crud.crudendpoints_homework.mapper.BaseMapper;
import pl.mzbiewski.crud.crudendpoints_homework.mapper.UserMapper;
import pl.mzbiewski.crud.crudendpoints_homework.model.UserDTO;
import pl.mzbiewski.crud.crudendpoints_homework.repository.UserRepository;
import pl.mzbiewski.crud.crudendpoints_homework.validator.BaseValidator;
import pl.mzbiewski.crud.crudendpoints_homework.validator.UserValidator;

@Service
@RequiredArgsConstructor
public class UserService extends AbstractService<UserEntity, UserDTO> {

    private final UserRepository userRepository;

    private final UserValidator userValidator;

    private final UserMapper userMapper;


    @Override
    protected JpaRepository<UserEntity, Long> getRepository() {
        return userRepository;
    }

    @Override
    protected BaseValidator<UserDTO> getValidator() {
        return userValidator;
    }

    @Override
    protected BaseMapper<UserEntity, UserDTO> getMapper() {
        return userMapper;
    }
}
