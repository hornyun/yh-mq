package com.yh.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/4/19
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue() {
        return new Queue("hornYun");
    }

    @Bean
    public Queue one2Many() {
        return new Queue("one2Many");
    }


    @Bean
    public Queue many2Many() {
        return new Queue("many2many");
    }

    @Bean
    public Queue pojo() {
        return new Queue("pojo");
    }


    //topic ---------------------------------------------------------------
    @Bean
    public Queue topicMessageA() {
        return new Queue("topic.messageA");
    }

    @Bean
    public Queue topicMessageB() {
        return new Queue("topic.messageB");
    }


    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange("exchange");
    }

    @Bean
    public Binding bindingA(Queue topicMessageA, TopicExchange topicExchange) {
        return BindingBuilder.bind(topicMessageA).to(topicExchange).with("topic.#");
    }

    @Bean
    public Binding bindingB(Queue topicMessageB, TopicExchange topicExchange) {
        return BindingBuilder.bind(topicMessageB).to(topicExchange).with("topic.*");
    }

    //topic ---------------------------------------------------------------
}
