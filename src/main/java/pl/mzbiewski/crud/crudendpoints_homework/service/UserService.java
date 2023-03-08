package pl.mzbiewski.crud.crudendpoints_homework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mzbiewski.crud.crudendpoints_homework.entity.UserEntity;
import pl.mzbiewski.crud.crudendpoints_homework.mapper.UserMapper;
import pl.mzbiewski.crud.crudendpoints_homework.model.UserDTO;
import pl.mzbiewski.crud.crudendpoints_homework.repository.BaseRepository;
import pl.mzbiewski.crud.crudendpoints_homework.validator.BaseValidator;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService extends AbstractService<UserEntity, UserDTO> {

    @Autowired
    public UserService(BaseRepository<UserEntity> repository, BaseValidator<UserDTO> validator) {
        super(repository, validator);
    }


}
