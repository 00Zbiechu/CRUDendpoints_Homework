package pl.mzbiewski.crud.crudendpoints_homework.entity;

import jakarta.persistence.*;
import lombok.*;

import java.awt.print.Book;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class UserEntity implements BaseEntity<UserEntity>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence")
    @SequenceGenerator(name = "sequence", initialValue = 2)
    Long id;

    String username;
    String password;

    @OneToMany(mappedBy = "userEntity")
    @ToString.Exclude
    List<RoleEntity> roles;



}
