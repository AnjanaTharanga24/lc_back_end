package lk.zerocode.lcprojectapi.service;

import lk.zerocode.lcprojectapi.controller.request.StudentRequest;
import lk.zerocode.lcprojectapi.controller.response.StudentResponse;
import lk.zerocode.lcprojectapi.model.Student;

public interface StudentService {

    StudentResponse registerStudent(StudentRequest studentRequest);
}
