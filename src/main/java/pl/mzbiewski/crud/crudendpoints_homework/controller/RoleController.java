package pl.mzbiewski.crud.crudendpoints_homework.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mzbiewski.crud.crudendpoints_homework.model.RoleDTO;
import pl.mzbiewski.crud.crudendpoints_homework.service.RoleService;

@RestController
@RequestMapping("/api/role")
@RequiredArgsConstructor
public class RoleController extends BaseController<RoleDTO, RoleService> {

    private final RoleService roleService;

    @Override
    protected RoleService getService() {
        return roleService;
    }
}
