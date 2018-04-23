package com.yh.mq.scenes.callback;

import com.yh.mq.scenes.Sender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/4/23
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Slf4j
@Component
public class CallBackSender implements Sender, RabbitTemplate.ConfirmCallback {

    @Autowired
    private RabbitTemplate template;

    @Override
    public void sendMessage(String message) {
        template.setConfirmCallback(this);
        CorrelationData correlationData = new CorrelationData(message);

        template.convertAndSend("exchange", "topic.callback.123", message, correlationData);

    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        if (ack) {
            log.info("callback confirm_message:{}", correlationData.getId());
        } else {
            this.sendMessage(correlationData.getId());
        }
    }
}
