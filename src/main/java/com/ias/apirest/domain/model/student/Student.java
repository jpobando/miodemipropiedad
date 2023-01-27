package com.ias.apirest.domain.model.student;

public class Student {
    private StudentId id;
    private StudentName name;
    private StudentPhone phone;
    private StudentEmail email;

    public Student(StudentId id, StudentName name, StudentPhone phone, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public StudentId getId() {
        return id;
    }

    public void setId(StudentId id) {
        this.id = id;
    }

    public StudentName getName() {
        return name;
    }

    public void setName(StudentName name) {
        this.name = name;
    }

    public StudentPhone getPhone() {
        return phone;
    }

    public void setPhone(StudentPhone phone) {
        this.phone = phone;
    }

    public StudentEmail getEmail() {
        return email;
    }

    public void setEmail(StudentEmail email) {
        this.email = email;
    }
}
