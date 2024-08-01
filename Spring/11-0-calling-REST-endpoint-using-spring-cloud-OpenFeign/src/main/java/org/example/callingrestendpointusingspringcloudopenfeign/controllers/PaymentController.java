package org.example.callingrestendpointusingspringcloudopenfeign.controllers;

import org.example.callingrestendpointusingspringcloudopenfeign.model.Payment;
import org.example.callingrestendpointusingspringcloudopenfeign.proxy.PaymentProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {

    private final PaymentProxy paymentProxy;
    @Autowired
    public PaymentController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ) {
        String requestId = UUID.randomUUID().toString();
        return paymentProxy.createPayment(requestId, payment);
    }
}
