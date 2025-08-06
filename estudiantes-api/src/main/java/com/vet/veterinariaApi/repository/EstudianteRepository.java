package com.vet.veterinariaApi.repository;


import com.vet.veterinariaApi.model.Estudiante;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends ReactiveCrudRepository<Estudiante, Long> {
}