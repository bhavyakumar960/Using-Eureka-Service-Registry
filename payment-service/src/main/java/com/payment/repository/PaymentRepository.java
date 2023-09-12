package com.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
