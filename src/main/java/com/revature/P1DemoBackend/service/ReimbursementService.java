package com.revature.P1DemoBackend.service;

import com.revature.P1DemoBackend.dto.ReimbursementDto;
import com.revature.P1DemoBackend.dto.UserDto;
import com.revature.P1DemoBackend.exception.ReimbursementNotFoundException;
import com.revature.P1DemoBackend.model.Reimbursement;

import java.util.Optional;

public interface ReimbursementService {

    //All user tasks
    Optional<ReimbursementDto> createReimbursement(ReimbursementDto reimbursementDto);
    Optional<ReimbursementDto> getAllReimbursementByUser(UserDto userDto) throws ReimbursementNotFoundException;
    Optional<ReimbursementDto> getAllPendingReimbursementByUser(UserDto userDto) throws ReimbursementNotFoundException;

    //All Manager TASKS
    Optional<ReimbursementDto> getAllReimbursement();
    Optional<ReimbursementDto> getAllPendingReimbursement();
    Optional<ReimbursementDto> updateReimbursementPartially(ReimbursementDto reimbursementDto, UserDto userDto) throws ReimbursementNotFoundException;

}
