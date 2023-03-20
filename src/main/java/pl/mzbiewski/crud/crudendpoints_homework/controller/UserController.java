package pl.mzbiewski.crud.crudendpoints_homework.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mzbiewski.crud.crudendpoints_homework.entity.UserEntity;
import pl.mzbiewski.crud.crudendpoints_homework.model.UserDTO;
import pl.mzbiewski.crud.crudendpoints_homework.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController extends BaseController<UserDTO, UserService> {

    private final UserService userService;

    @Override
    protected UserService getService() {
        return userService;
    }


}
