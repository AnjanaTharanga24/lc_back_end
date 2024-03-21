package lk.zerocode.lcprojectapi.controller.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class StudentRequest {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate registerDate;
    private String classType;
    private String studentType;

}
