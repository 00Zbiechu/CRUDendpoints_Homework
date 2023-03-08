package pl.mzbiewski.crud.crudendpoints_homework.controller;

import jakarta.persistence.MappedSuperclass;
import lombok.ToString;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mzbiewski.crud.crudendpoints_homework.entity.BaseEntity;
import pl.mzbiewski.crud.crudendpoints_homework.model.BaseDTO;
import pl.mzbiewski.crud.crudendpoints_homework.service.AbstractService;

import java.util.List;


public abstract class BaseController<T extends BaseEntity<T>,D extends BaseDTO<D>> {

    private final AbstractService<T,D> service;

    public BaseController(AbstractService<T, D> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<T>> get(){
        System.out.println(service.get().toString());
        return ResponseEntity.ok(service.get());
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody T body){
        service.create(body);
        return ResponseEntity.ok("Dodano");
    }

    @PutMapping("{id}")
    public ResponseEntity<String> update(@PathVariable Long id,@RequestBody T body){
        service.update(id,body);
        return ResponseEntity.ok("Zmieniono");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok("Usunięto");
    }




}
