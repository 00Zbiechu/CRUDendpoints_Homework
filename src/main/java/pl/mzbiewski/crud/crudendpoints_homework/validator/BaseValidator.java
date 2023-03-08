package pl.mzbiewski.crud.crudendpoints_homework.validator;

import org.springframework.stereotype.Component;


public interface BaseValidator<T>{

    void validate(T dto);

}
