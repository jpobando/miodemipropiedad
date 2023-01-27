package com.ias.apirest.infrastructure.adapters.jpa;

import com.ias.apirest.infrastructure.adapters.jpa.entity.StudentDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentAdapterRepository extends JpaRepository<StudentDBO, Long> {
}
