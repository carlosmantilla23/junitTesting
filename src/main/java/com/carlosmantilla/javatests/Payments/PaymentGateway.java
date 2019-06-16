package com.carlosmantilla.javatests.Payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);



}
