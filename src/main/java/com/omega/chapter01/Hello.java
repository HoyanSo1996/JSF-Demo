package com.omega.chapter01;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Class HelloWorld
 *
 * @author KennySu
 * @date 2023/10/26
 */
@ManagedBean
@RequestScoped
public class Hello {

    /**
     * 依赖注入时,必须要@ManagedProperty注解和setter方法,不需要getter方法。
     */
    @ManagedProperty(value = "#{message}")
    private Message message;

    public void setMessage(Message message) {
        this.message = message;
    }

    /**
     * Tip:不能重写getter方法作为q前端拿消息的方法, 否则会报注入message对象失败的错误
     */
    /*public String getMessage() {
        if(message != null) {
            return message.getMessage();
        }
        return "";
    }*/

    public String getSayHello() {
        if(message != null) {
            return message.getMessage();
        }
        return "";
    }
}
