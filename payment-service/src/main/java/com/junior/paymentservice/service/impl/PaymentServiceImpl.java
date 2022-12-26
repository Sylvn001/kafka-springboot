package com.junior.paymentservice.service.impl;

import com.junior.paymentservice.model.Payment;
import com.junior.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Service
@Log4j2
public class PaymentServiceImpl  implements PaymentService {
    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @Override
    @SneakyThrows
    public void sendPayment(Payment payment) {
       log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento {}", payment);
       Thread.sleep(1000);
       log.info("Enviando pagamento ...");

       kafkaTemplate.send("payment-topic", payment);
    }
}
