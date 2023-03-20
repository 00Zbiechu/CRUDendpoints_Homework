package pl.mzbiewski.crud.crudendpoints_homework.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", initialValue = 3)
    Long id;

    String username;
    String password;

    @OneToMany(mappedBy = "userEntity")
    @ToString.Exclude
    List<RoleEntity> roles;



}
