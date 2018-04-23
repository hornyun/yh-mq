package com.yh.mq.scenes.pojoTransfer;

import com.yh.mq.domain.User;
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
@RabbitListener(queues = "pojo")
@Slf4j
public class PojoReceiver implements Receiver {

    @Override
    public void receive(String message) {
    }

    @RabbitHandler
    public void receive(Object user) {
        log.info("I have received a Object:{}", user);
    }
}
