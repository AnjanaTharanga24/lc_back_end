package lk.zerocode.lcprojectapi.service;

import lk.zerocode.lcprojectapi.controller.request.StudentRegisterRequest;
import lk.zerocode.lcprojectapi.controller.response.StudentRegisterResponse;
import lk.zerocode.lcprojectapi.model.Guardian;

import java.util.List;

public interface StudentService {

    StudentRegisterResponse registerStudent(StudentRegisterRequest studentRequest);
}
