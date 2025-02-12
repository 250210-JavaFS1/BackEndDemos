package com.revature.P1DemoBackend.service.implementation;

import com.revature.P1DemoBackend.dto.ReimbursementDto;
import com.revature.P1DemoBackend.exception.ReimbursementNotFoundException;
import com.revature.P1DemoBackend.service.ReimbursementService;

import java.util.Optional;

public class ReimbursementServiceImplementation implements ReimbursementService {
    @Override
    public Optional<ReimbursementDto> getAllReimbursement() {
        return Optional.empty();
    }

    @Override
    public Optional<ReimbursementDto> getAllPendingReimbursement() {
        return Optional.empty();
    }

    @Override
    public Optional<ReimbursementDto> updateReimbursementPartially(ReimbursementDto reimbursementDto) throws ReimbursementNotFoundException {
        return Optional.empty();
    }
}
