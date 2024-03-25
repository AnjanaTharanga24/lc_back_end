package lk.zerocode.lcprojectapi.controller;

import lk.zerocode.lcprojectapi.controller.request.StudentRegisterRequest;
import lk.zerocode.lcprojectapi.controller.response.StudentRegisterResponse;
import lk.zerocode.lcprojectapi.model.Guardian;
import lk.zerocode.lcprojectapi.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

    StudentService studentService;

    @PostMapping("/students")
    public StudentRegisterResponse registerStudent(@RequestBody StudentRegisterRequest studentRequest){
        return studentService.registerStudent(studentRequest);
    }
}
