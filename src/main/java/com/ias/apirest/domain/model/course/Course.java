package com.ias.apirest.domain.model.course;

public class Course {
    private final CourseId courseId;
    private final CourseName courseName;

    public Course(CourseId courseId, CourseName courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public CourseId getCourseId() {
        return courseId;
    }

    public CourseName getCourseName() {
        return courseName;
    }
}
