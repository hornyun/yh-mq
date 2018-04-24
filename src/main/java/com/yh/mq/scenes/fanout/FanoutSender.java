package com.yh.mq.scenes.fanout;

import com.yh.mq.scenes.Sender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/4/24
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Component
public class FanoutSender implements Sender {
    @Autowired
    private RabbitTemplate template;


    @Override
    public void sendMessage(String message) {
        template.convertAndSend("fanoutExchange", "", message);
    }
}
