package com.yh.mq.scenes.single;

import com.yh.mq.scenes.Receiver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
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
@RabbitListener(queues = "hornYun")
@Slf4j
public class SingleReceiver implements Receiver{


    @Override
    @RabbitHandler
    public void receive(String message) {
        log.info("SingleReceiver have received a message:{}" , message);


    }

}
