package com.sadusha.rentacar.demoapplication.service;

import com.sadusha.rentacar.demoapplication.model.Student;

public interface StudentService {
    Student save(Student student);
    public Student fetchStudentById(int id);
}
