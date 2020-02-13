package com.jenkins.demo.service.impl;

import com.jenkins.demo.common.StudentMap;
import com.jenkins.demo.request.StudentRequest;
import com.jenkins.demo.response.StudentResponse;
import com.jenkins.demo.service.StudentService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Override
    public StudentResponse create(StudentRequest studentRequest) {
        return StudentMap
                .mapStudentRequestToResponse(studentRequest);
    }

    @Override
    public StudentResponse get(Integer id) {
        return StudentResponse
                .builder()
                .id(id)
                .build();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public StudentResponse update(Integer id, StudentRequest studentRequest) {
            return StudentMap
                    .mapStudentRequestToResponse(studentRequest);
    }
}
