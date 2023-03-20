package pl.mzbiewski.crud.crudendpoints_homework.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UserDTO {

    Long id;

    String username;

    String password;


}
