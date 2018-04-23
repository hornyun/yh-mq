package com.yh.mq.controller;

import com.yh.mq.domain.User;
import com.yh.mq.scenes.pojoTransfer.PojoSender;
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
@RequestMapping("/pojo")
public class PojoController {

    @Autowired
    private PojoSender sender;

    @GetMapping("/{username}/{password}")
    public void sendUser(@PathVariable("username") String username, @PathVariable("password") String password) {
        User user = new User(username, password);
        sender.sendMessage(user);
    }

}
