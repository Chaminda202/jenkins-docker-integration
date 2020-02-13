package com.jenkins.demo.service;

import com.jenkins.demo.request.StudentRequest;
import com.jenkins.demo.response.StudentResponse;

public interface StudentService {
    StudentResponse create(StudentRequest studentRequest);
    StudentResponse get(Integer id);
    void delete(Integer id);
    StudentResponse update(Integer id, StudentRequest studentRequest);
}
