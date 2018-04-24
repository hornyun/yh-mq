package com.yh.mq.controller;

import com.yh.mq.scenes.fanout.FanoutSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/4/24
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@RestController
@RequestMapping("/fanout")
public class FanoutController {

    @Autowired
    private FanoutSender sender;

    @GetMapping
    @RequestMapping("/{count}")
    public void sendMessage(@PathVariable("count") Integer count) {
        for (int i = 0; i < count; i++) {
            sender.sendMessage("this is a message from fanout,times is " + (i + 1));
        }
    }

}
