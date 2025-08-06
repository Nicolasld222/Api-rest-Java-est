package com.vet.veterinariaApi.controller;

import com.vet.veterinariaApi.model.Estudiante;
import com.vet.veterinariaApi.service.EstudianteService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<Estudiante> create(@RequestBody Estudiante estudiante) {
        return service.create(estudiante);
    }

    @GetMapping
    public Flux<Estudiante> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Estudiante> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Mono<Estudiante> update(@PathVariable Long id, @RequestBody Estudiante person) {
        return service.update(id, person);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}

