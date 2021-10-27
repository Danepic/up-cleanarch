package br.com.danepic.cleanarch.gateways.entrypoints.consumers.rabbit;

import br.com.danepic.cleanarch.gateways.entrypoints.consumers.rabbit.model.EnrichmentCacheDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Component
public class CustomerSyncConsumer {

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Valid @Payload final EnrichmentCacheDto<List<String>> enrichmentCacheDto) {
        log.info("[QUEUE] Consumer Status: " + enrichmentCacheDto.getValue());
    }
}
