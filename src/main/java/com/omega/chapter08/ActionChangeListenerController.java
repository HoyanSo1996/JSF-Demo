package com.omega.chapter08;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.Map;

/**
 * Class ActionChangeController
 *
 * @author KennySu
 * @date 2023/10/30
 */
@ManagedBean
@SessionScoped  // 不能是@RequestScope, 否则每次点击增加按钮, value都会初始化为0.
@Data
public class ActionChangeListenerController implements Serializable {

    private static final long serialVersionUID = 1L;

    private static Map<String, String> countryMap;

    private int value = 0;


    public void increase(ActionEvent e) {
        value++;
    }

    public void decrease() {
        value--;
    }
}
