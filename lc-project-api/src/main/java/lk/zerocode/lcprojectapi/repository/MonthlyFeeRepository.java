package lk.zerocode.lcprojectapi.repository;

import lk.zerocode.lcprojectapi.model.MonthlyFee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyFeeRepository extends JpaRepository<MonthlyFee , Long> {
}
