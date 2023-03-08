package pl.mzbiewski.crud.crudendpoints_homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mzbiewski.crud.crudendpoints_homework.entity.UserEntity;
import pl.mzbiewski.crud.crudendpoints_homework.model.UserDTO;
import pl.mzbiewski.crud.crudendpoints_homework.service.AbstractService;
import pl.mzbiewski.crud.crudendpoints_homework.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController<UserEntity,UserDTO> {

    private final UserService userService;

    @Autowired
    public UserController(AbstractService<UserEntity, UserDTO> service, UserService userService) {
        super(service);
        this.userService = userService;
    }

}
