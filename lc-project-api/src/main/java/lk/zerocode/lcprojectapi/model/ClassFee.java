package lk.zerocode.lcprojectapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "class_fee_table")
public class ClassFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classType;
    private String enrolledYear;
    private Float enrollmentFee;
    private Float examFee;
    private Float bookPayment;

    @ManyToOne
    private MonthlyFee monthlyFee;

    @OneToMany(mappedBy = "classFee")
    private List<Student> studentList;

}
