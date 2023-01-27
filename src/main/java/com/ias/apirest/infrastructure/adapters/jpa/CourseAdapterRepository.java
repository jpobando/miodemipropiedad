package com.ias.apirest.infrastructure.adapters.jpa;

import com.ias.apirest.domain.model.course.Course;
import com.ias.apirest.domain.model.gateway.ICourseRepository;
import com.ias.apirest.domain.model.student.Student;
import com.ias.apirest.infrastructure.adapters.jpa.entity.CourseDBO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseAdapterRepository implements ICourseRepository {

    public final ICourseAdapterRepository iCourseAdapterRepository;

    public CourseAdapterRepository(ICourseAdapterRepository iCourseAdapterRepository) {
        this.iCourseAdapterRepository = iCourseAdapterRepository;
    }

    @Override
    public Course saveCourse(Course course) {
        return CourseDBO.toDomain(iCourseAdapterRepository.save(CourseDBO.fromDomain(course)));
    }

    @Override
    public Course findCourseById(Long id) {
        return null;
    }

    @Override
    public List<Student> findStudentsByCourse(Long id) {
        return null;
    }
}
