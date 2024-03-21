package lk.zerocode.lcprojectapi.repository;

import lk.zerocode.lcprojectapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
