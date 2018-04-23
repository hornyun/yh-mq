package com.yh.mq.controller;

import com.yh.mq.scenes.many2many.Many2ManySender1;
import com.yh.mq.scenes.many2many.Many2ManySender2;
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
@RequestMapping("/many2many")
public class Many2ManyController {

    @Autowired
    private Many2ManySender1 sender1;

    @Autowired
    private Many2ManySender2 sender2;
    @GetMapping("/{count}")
    public void sendMessage(@PathVariable("count") Integer count) {
        for (int i = 0; i < count; i++) {
                sender1.sendMessage("this is many2many message,the "+(i+1) +" times");
                sender2.sendMessage("this is many2many message,the "+(i+1) +" times");
        }

    }
}
