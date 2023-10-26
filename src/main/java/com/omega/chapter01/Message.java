package com.omega.chapter01;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Class Message
 *
 * @author KennySu
 * @date 2023/10/26
 */
@ManagedBean
@RequestScoped
public class Message {

    private String message = "Hello World!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
