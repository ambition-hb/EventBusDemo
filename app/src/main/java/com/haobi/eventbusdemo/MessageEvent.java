package com.haobi.eventbusdemo;

/**
 * Created by 15739 on 2019/3/22.
 */

public class MessageEvent {//定义消息事件类
    private String message;
    public MessageEvent(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
}
