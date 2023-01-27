package com.ias.apirest.infrastructure.adapters.jpa;


import com.ias.apirest.infrastructure.adapters.jpa.entity.CourseDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseAdapterRepository extends JpaRepository<CourseDBO, Long> {

}
