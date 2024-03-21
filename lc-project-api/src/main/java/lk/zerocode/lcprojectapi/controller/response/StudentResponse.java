package lk.zerocode.lcprojectapi.controller.response;

import lk.zerocode.lcprojectapi.model.ClassFee;
import lk.zerocode.lcprojectapi.model.Student;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private ClassFee classFee;
}
