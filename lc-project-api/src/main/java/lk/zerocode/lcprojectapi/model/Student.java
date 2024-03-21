package lk.zerocode.lcprojectapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
@Table(name = "student_table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String email;
    private String dob;
    private String contactNumber;
    private String address;
    private LocalDate registerDate;
    private String classType;
    private String studentType;

    @ManyToOne
    private ClassFee classFee;


}
