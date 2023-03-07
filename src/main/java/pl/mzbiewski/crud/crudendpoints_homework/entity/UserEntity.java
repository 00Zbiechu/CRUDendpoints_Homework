package pl.mzbiewski.crud.crudendpoints_homework.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String username;
    String password;

    @OneToMany(mappedBy = "userEntity")
    List<RoleEntity> roles;

}
