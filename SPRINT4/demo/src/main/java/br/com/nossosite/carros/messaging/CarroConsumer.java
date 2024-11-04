package br.com.nossosite.carros.messaging;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CarroConsumer {

    @KafkaListener(topics = "carro-topic", groupId = "grupo-carros")
    public void consumirMensagem(String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }
}
