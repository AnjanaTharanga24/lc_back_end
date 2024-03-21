package lk.zerocode.lcprojectapi.service.impl;

import lk.zerocode.lcprojectapi.controller.request.StudentRequest;
import lk.zerocode.lcprojectapi.controller.response.StudentResponse;
import lk.zerocode.lcprojectapi.model.Student;
import lk.zerocode.lcprojectapi.repository.StudentRepository;
import lk.zerocode.lcprojectapi.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public StudentResponse registerStudent(StudentRequest studentRequest) {
        return null;
    }
}
