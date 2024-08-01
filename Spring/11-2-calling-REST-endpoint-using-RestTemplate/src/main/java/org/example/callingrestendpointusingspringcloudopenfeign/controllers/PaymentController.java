package org.example.callingrestendpointusingspringcloudopenfeign.controllers;

import org.example.callingrestendpointusingspringcloudopenfeign.model.Payment;
import org.example.callingrestendpointusingspringcloudopenfeign.proxy.PaymentsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentsProxy paymentsProxy;
    @Autowired
    public PaymentController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ) {
        return paymentsProxy.createPayment(payment);
    }
}
