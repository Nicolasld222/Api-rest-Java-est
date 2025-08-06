package com.vet.veterinariaApi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("estudiante")
public record Estudiante(
        @Id Long id,
        String nombreEst,
        String acudiente
) {}