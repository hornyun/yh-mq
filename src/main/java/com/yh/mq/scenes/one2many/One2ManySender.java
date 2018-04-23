package com.yh.mq.scenes.one2many;

import com.yh.mq.scenes.Sender;
import org.springframework.amqp.core.AmqpTemplate;
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
public class One2ManySender implements Sender{

    @Autowired
    private AmqpTemplate template;

    @Override
    public void sendMessage(String message) {
        template.convertAndSend("one2Many", message);
    }
}
