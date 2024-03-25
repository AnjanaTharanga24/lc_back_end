package lk.zerocode.lcprojectapi.controller.request;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lk.zerocode.lcprojectapi.model.Gender;
import lk.zerocode.lcprojectapi.model.Student;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class StudentRequest {


    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private String dob;
    private String contactNumber;
    private String address;
    private String registerDate;
    private String classType;
    private Integer familyCount;
    private List<Student> studentList;


}
