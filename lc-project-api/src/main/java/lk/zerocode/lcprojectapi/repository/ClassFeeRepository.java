package lk.zerocode.lcprojectapi.repository;

import lk.zerocode.lcprojectapi.model.ClassFee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClassFeeRepository extends JpaRepository<ClassFee, Long> {
     Optional<ClassFee> findByClassType(String classType);
}

