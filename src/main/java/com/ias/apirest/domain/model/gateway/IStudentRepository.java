package com.ias.apirest.domain.model.gateway;

import com.ias.apirest.domain.model.student.Student;


import java.util.ArrayList;

public interface IStudentRepository {

    Student saveStudent(Student student);

    Student findStudentById(Long id);

    ArrayList<Student> getStudentsList();
}
