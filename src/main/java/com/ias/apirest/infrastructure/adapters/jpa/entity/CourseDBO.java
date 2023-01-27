package com.ias.apirest.infrastructure.adapters.jpa.entity;

import com.ias.apirest.domain.model.course.Course;
import com.ias.apirest.domain.model.course.CourseId;
import com.ias.apirest.domain.model.course.CourseName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "course")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourseDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    public static CourseDBO fromDomain(Course course){
        return new CourseDBO(
                course.getCourseId().getValue(),
                course.getCourseName().getValue()
        );
    }

    public static Course toDomain(CourseDBO courseDBO){
        return new Course(
                new CourseId(courseDBO.getId()),
                new CourseName(courseDBO.getName())
        );
    }
}
