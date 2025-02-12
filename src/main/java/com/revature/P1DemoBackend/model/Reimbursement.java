package com.revature.P1DemoBackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Reimbursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reImbId;
    private String description;
    private double amount;
    private String status;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User userId;

    public Reimbursement( String description, double amount, String status, User userId) {

        this.description = description;
        this.amount = amount;
        this.status = status;
        this.userId = userId;
    }

}
