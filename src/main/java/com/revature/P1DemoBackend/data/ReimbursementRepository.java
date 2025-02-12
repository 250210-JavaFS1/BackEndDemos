package com.revature.P1DemoBackend.data;

import com.revature.P1DemoBackend.model.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReimbursementRepository extends JpaRepository<Reimbursement, Long> {
}
