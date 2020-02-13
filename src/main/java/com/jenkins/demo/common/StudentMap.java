package com.jenkins.demo.common;

import com.jenkins.demo.request.StudentRequest;
import com.jenkins.demo.response.StudentResponse;

public class StudentMap {
    private static Integer index = 1;
    private StudentMap(){
    }

    public static StudentResponse mapStudentRequestToResponse(StudentRequest studentRequest) {
        return StudentResponse.builder()
                .id(index++)
                .name(studentRequest.getName())
                .occupation(studentRequest.getOccupation())
                .salary(studentRequest.getSalary())
                .age(studentRequest.getAge())
                .build();
    }
}
