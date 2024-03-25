package lk.zerocode.lcprojectapi.controller.response;

import lk.zerocode.lcprojectapi.model.ClassFee;
import lk.zerocode.lcprojectapi.model.Student;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StudentRegisterResponse {

    private Long id;
    private String guardianName;
    private String guardianEmail;
    private String contactNumber;
    private List<Student> studentList;

}
