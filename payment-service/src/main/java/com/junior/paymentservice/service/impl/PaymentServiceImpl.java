package com.junior.paymentservice.service.impl;

import com.junior.paymentservice.model.Payment;
import com.junior.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PaymentServiceImpl  implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
       log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
    }
}