package pl.mzbiewski.crud.crudendpoints_homework.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;

}
