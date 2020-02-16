package com.aote.bmq.mq;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;


/**
 *
 */
@Component
@EnableJms // 表示开启jms注解
public class ConfigBean {

    @Value("${myqueue}")
    private String myQueue;

    @Bean //<bean id="" class=""> 相当于配置
    public Queue queue(){
        return new ActiveMQQueue(myQueue);
    }


}
