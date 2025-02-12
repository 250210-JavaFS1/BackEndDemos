package com.revature.P1DemoBackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name="users")
public class User {
    @Column(name = "userId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private String role;

    @OneToMany(mappedBy = "userId", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Reimbursement> reimbursements;
    public User( String firstName,
                String lastName, String userName,
                String passWord, String role) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
    }
}
