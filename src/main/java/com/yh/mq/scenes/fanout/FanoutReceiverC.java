package com.yh.mq.scenes.fanout;

import com.yh.mq.scenes.Receiver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
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
@Slf4j
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC implements Receiver {

    @Override
    @RabbitHandler
    public void receive(String message) {
        log.info("C have received a message:{}", message);
    }
}
