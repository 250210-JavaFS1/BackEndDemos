package com.revature.P1DemoBackend.dto;
public record ReimbursementDto(Long reImbId, String description, double amount, String status,UserDto userId) {
}
