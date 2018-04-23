package com.yh.mq.scenes.many2many;

import com.yh.mq.scenes.Receiver;
import lombok.Getter;
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
@Slf4j
@RabbitListener(queues = "many2many")
@Getter
public class Many2ManyReceiver2 implements Receiver {

    private Integer count = 0;

    @Override
    @RabbitHandler
    public void receive(String message) {
        count++;
        log.info("Many2ManyReceiver2 have received a message:{},times is{}", message,count);
    }
}
