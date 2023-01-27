package com.ias.apirest.domain.usecase;

import com.ias.apirest.domain.model.course.dto.CourseDTO;
import com.ias.apirest.domain.model.gateway.ICourseRepository;


public class CourseUseCase {

    private ICourseRepository iCourseRepository;

    public CourseUseCase(ICourseRepository iCourseRepository) {
        this.iCourseRepository = iCourseRepository;
    }

    public CourseDTO saveCourseDTO(CourseDTO courseDTO){

    }
}
