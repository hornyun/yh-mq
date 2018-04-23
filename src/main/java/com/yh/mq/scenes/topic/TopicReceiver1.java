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
@RabbitListener(queues = "topic.messageA")
@Component
public class TopicReceiver1 implements Receiver {
    @Override
    @RabbitHandler
    public void receive(String message) {
        log.info("TopicReceiver1 have received a message : {}", message);
    }
}
