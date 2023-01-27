package com.ias.apirest.infrastructure.adapters.jpa;

import com.ias.apirest.domain.model.gateway.IStudentRepository;
import com.ias.apirest.domain.model.student.Student;
import com.ias.apirest.infrastructure.adapters.jpa.entity.StudentDBO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class StudentAdapterRepository implements IStudentRepository {

    public final IStudentAdapterRepository iStudentAdapterRepository;

    public StudentAdapterRepository(IStudentAdapterRepository iStudentAdapterRepository) {
        this.iStudentAdapterRepository = iStudentAdapterRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return StudentDBO.toDomain(iStudentAdapterRepository.save(StudentDBO.fromDomain(student)));
    }

    @Override
    public Student findStudentById(Long id) {
        return null;
    }

    @Override
    public ArrayList<Student> getStudentsList() {
        return null;
    }
}
