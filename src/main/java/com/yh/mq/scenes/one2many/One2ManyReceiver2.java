package com.yh.mq.scenes.one2many;

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

@Component
@RabbitListener(queues = "one2Many")
@Slf4j
public class One2ManyReceiver2 implements Receiver{
    @Override
    @RabbitHandler
    public void receive(String message) {
        log.info("One2ManyReceiver2 have received a message:{}", message);
    }
}
