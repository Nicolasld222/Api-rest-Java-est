package com.vet.veterinariaApi.service;

import com.vet.veterinariaApi.model.Estudiante;
import com.vet.veterinariaApi.repository.EstudianteRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EstudianteService {

    private final EstudianteRepository repository;
    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository EstudianteRepository, EstudianteRepository estudianteRepository) {
        this.repository = estudianteRepository;
        this.estudianteRepository = estudianteRepository;
    }

    public Mono<Estudiante> create(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    public Flux<Estudiante> getAll() {
        return repository.findAll();
    }

    public Mono<Estudiante> getById(Long id) {
        return repository.findById(id);
    }

    public Mono<Estudiante> update(Long id, Estudiante newData) {
        return repository.findById(id)
                .flatMap(existing -> repository.save(new Estudiante(id, newData.nombreEst() , newData.acudiente())));
    }

    public Mono<Void> delete(Long id) {
        return repository.deleteById(id);
    }
}
