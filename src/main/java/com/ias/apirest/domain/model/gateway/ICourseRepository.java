package com.ias.apirest.domain.model.gateway;

import com.ias.apirest.domain.model.course.Course;
import com.ias.apirest.domain.model.student.Student;


import java.util.List;


public interface ICourseRepository {

    Course saveCourse(Course course);

    Course findCourseById(Long id);

    List<Student> findStudentsByCourse(Long id);
}
