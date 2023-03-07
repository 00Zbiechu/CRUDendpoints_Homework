package pl.mzbiewski.crud.crudendpoints_homework.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;

}
