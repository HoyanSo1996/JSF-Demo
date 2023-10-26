package com.omega.chapter;

import javax.faces.bean.ManagedBean;

/**
 * Class HelloWorld
 *
 * @author KennySu
 * @date 2023/10/26
 */
@ManagedBean(eager = true)
public class HelloWorld {

    public HelloWorld() {
        System.out.println("JSF started!");
    }

    public String getMessage() {
        return "Hello, JSF!";
    }
}
