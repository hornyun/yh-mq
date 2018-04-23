package com.yh.mq.controller;

import com.yh.mq.scenes.callback.CallBackSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/callback")
public class CallbackController {
    @Autowired
    private CallBackSender sender;

    @GetMapping("/do")
    public void doCall() {
        sender.sendMessage("this is message which I hope get call back Info");
    }
}
