package pl.mzbiewski.crud.crudendpoints_homework.model;

import lombok.Data;
import pl.mzbiewski.crud.crudendpoints_homework.validator.BaseValidator;

@Data
public class RoleDTO implements BaseDTO<RoleDTO> {

    Long id;
    String role;


}
