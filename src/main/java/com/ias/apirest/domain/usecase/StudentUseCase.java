package com.ias.apirest.domain.usecase;

import com.ias.apirest.domain.model.gateway.IStudentRepository;

public class StudentUseCase {

    public final IStudentRepository iStudentRepository;

    public StudentUseCase(IStudentRepository iStudentRepository) {
        this.iStudentRepository = iStudentRepository;
    }



}
