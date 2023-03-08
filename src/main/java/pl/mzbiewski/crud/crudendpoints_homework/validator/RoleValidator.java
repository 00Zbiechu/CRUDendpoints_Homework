package pl.mzbiewski.crud.crudendpoints_homework.validator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.mzbiewski.crud.crudendpoints_homework.model.RoleDTO;

@Component
public class RoleValidator implements BaseValidator<RoleDTO>{
    @Override
    public void validate(RoleDTO dto) {
        System.out.println("Zwalidowano role");
    }
}
