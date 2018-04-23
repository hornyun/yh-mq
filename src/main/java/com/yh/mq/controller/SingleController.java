package com.yh.mq.controller;

import com.yh.mq.scenes.single.SingleSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/4/23
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@RestController
@RequestMapping("/single")
public class SingleController {

    @Autowired
    private SingleSender sender;

    @GetMapping("/{message}")
    public void sendSingleMessage(@PathVariable("message") String message) {
        sender.sendMessage(message);
    }
}
