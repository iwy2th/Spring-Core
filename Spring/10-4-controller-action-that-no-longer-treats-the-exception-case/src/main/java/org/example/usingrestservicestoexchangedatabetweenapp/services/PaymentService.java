package org.example.usingrestservicestoexchangedatabetweenapp.services;

import org.example.usingrestservicestoexchangedatabetweenapp.exceptions.NotEnoughMoneyException;
import org.example.usingrestservicestoexchangedatabetweenapp.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
