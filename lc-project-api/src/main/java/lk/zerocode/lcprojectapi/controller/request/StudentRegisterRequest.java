package lk.zerocode.lcprojectapi.controller.request;


import lk.zerocode.lcprojectapi.model.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentRegisterRequest {

    private Long id;
    private String guardianName;
    private String guardianEmail;
    private String contactNumber;
    private String address;
    private Integer childrenCount;
    private List<Student> studentList;

}
