package lk.zerocode.lcprojectapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "student_table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentId;
    private String firstName;
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String dob;
    private String registerDate;
    private String classType;

    @ManyToOne
    private Guardian guardian;

    @ManyToOne(cascade = CascadeType.ALL)
    private ClassFee classFee;


}
