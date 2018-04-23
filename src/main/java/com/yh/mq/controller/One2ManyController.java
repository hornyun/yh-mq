package com.yh.mq.controller;

import com.yh.mq.scenes.one2many.One2ManySender;
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
@RequestMapping("/one2many")
public class One2ManyController {

    @Autowired
    private One2ManySender sender;

    @GetMapping("/{count}")
    public void sendMessageByCount(@PathVariable("count") Integer count) {

        for (int i = 0; i < count; i++) {
            sender.sendMessage("this is the" + (i + 1) + "times message");
        }
    }
}
