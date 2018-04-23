package com.yh.mq.scenes.topic;

import com.yh.mq.scenes.Receiver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/4/23
 * @copyright: 上海英和
 * @QQ: 583760722
 */

@Slf4j
@RabbitListener(queues = "topic.messageB")
@Component
public class TopicReceiver2 implements Receiver {
    @Override
    @RabbitHandler
    public void receive(String message) {
        log.info("TopicReceiver2 have received a message : {}", message);
    }
}
