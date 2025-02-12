package com.revature.P1DemoBackend.service.implementation;

import com.revature.P1DemoBackend.dto.ReimbursementDto;
import com.revature.P1DemoBackend.dto.UserDto;
import com.revature.P1DemoBackend.exception.ReimbursementNotFoundException;
import com.revature.P1DemoBackend.service.ReimbursementService;

import java.util.Optional;

public class ReimbursementServiceImplementation implements ReimbursementService {

    @Override
    public Optional<ReimbursementDto> createReimbursement(ReimbursementDto reimbursementDto) {
        return Optional.empty();
    }

    @Override
    public Optional<ReimbursementDto> getAllReimbursementByUser(UserDto userDto) throws ReimbursementNotFoundException {
        return Optional.empty();
    }

    @Override
    public Optional<ReimbursementDto> getAllPendingReimbursementByUser(UserDto userDto) throws ReimbursementNotFoundException {
        return Optional.empty();
    }

    @Override
    public Optional<ReimbursementDto> getAllReimbursement() {
        return Optional.empty();
    }

    @Override
    public Optional<ReimbursementDto> getAllPendingReimbursement() {
        return Optional.empty();
    }

    @Override
    public Optional<ReimbursementDto> updateReimbursementPartially(ReimbursementDto reimbursementDto, UserDto userDto) throws ReimbursementNotFoundException {
        return Optional.empty();
    }
}
