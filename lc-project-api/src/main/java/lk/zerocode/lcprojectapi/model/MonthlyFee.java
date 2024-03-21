package lk.zerocode.lcprojectapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "monthly_fee_table")
public class MonthlyFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classType;
    private String enrolledYear;
    private Integer studentCount;
    private Float feePerStudent;

    @OneToMany(mappedBy = "monthlyFee")
    private List<ClassFee> feeList;
}
