package pl.mzbiewski.crud.crudendpoints_homework.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import pl.mzbiewski.crud.crudendpoints_homework.validator.BaseValidator;

@Getter
@Setter
public class UserDTO implements BaseDTO<UserDTO> {

    Long id;

    String username;

    String password;


}
