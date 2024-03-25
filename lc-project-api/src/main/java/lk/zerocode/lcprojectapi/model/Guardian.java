package lk.zerocode.lcprojectapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "guardian_table")
public class Guardian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String contactNumber;
    private String address;
    private Integer childrenCount;

    @OneToMany(mappedBy = "guardian" , cascade = CascadeType.ALL)
    private List<Student> studentList;

}
