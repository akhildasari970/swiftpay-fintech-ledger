package com.swiftpay.gateway.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    private String paymentId;

    private String senderId;

    private String receiverId;

    private Double amount;

    private String currency;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    private Instant createdAt;
}
