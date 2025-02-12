package com.revature.P1DemoBackend.service;

import com.revature.P1DemoBackend.dto.ReimbursementDto;
import com.revature.P1DemoBackend.exception.ReimbursementNotFoundException;
import com.revature.P1DemoBackend.model.Reimbursement;

import java.util.Optional;

public interface ReimbursementService {
    Optional<ReimbursementDto> getAllReimbursement();
    Optional<ReimbursementDto> getAllPendingReimbursement();
    Optional<ReimbursementDto> updateReimbursementPartially(ReimbursementDto reimbursementDto) throws ReimbursementNotFoundException;


}
