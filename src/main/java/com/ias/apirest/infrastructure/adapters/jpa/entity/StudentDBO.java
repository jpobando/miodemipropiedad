package com.ias.apirest.infrastructure.adapters.jpa.entity;

import com.ias.apirest.domain.model.student.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;

    public static StudentDBO fromDomain(Student student){
        return new StudentDBO(
                student.getId().getValue(),
                student.getName().getValue(),
                student.getPhone().getValue(),
                student.getEmail().getEmail()
        );
    }

    public static Student toDomain(StudentDBO studentDBO){
        return new Student(
                new StudentId(studentDBO.getId()),
                new StudentName(studentDBO.getName()),
                new StudentPhone(studentDBO.getPhone()),
                new StudentEmail(studentDBO.getEmail())
        );
    }
}
