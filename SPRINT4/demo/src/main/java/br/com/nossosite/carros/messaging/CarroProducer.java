package br.com.nossosite.carros.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CarroProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void enviarMensagem(String mensagem) {
        kafkaTemplate.send("carro-topic", mensagem);
    }
}
