package pl.mzbiewski.crud.crudendpoints_homework.validator;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.mzbiewski.crud.crudendpoints_homework.model.UserDTO;

@Component
public class UserValidator implements BaseValidator<UserDTO>{
    @Override
    public void validate(UserDTO dto) {
        System.out.println("Zwalidowano użytkownika");
    }
}
