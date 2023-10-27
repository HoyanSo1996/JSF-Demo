package com.omega.chapter08;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;
import java.io.Serializable;

/**
 * Class SystemEventListenerController
 *
 * @author KennySu
 * @date 2023/10/30
 */
@ManagedBean
@SessionScoped
@Data
public class SystemEventListenerController implements Serializable {

    private static final long serialVersionUID = 1L;

    private String data = "sample data";

    /**
     * Method Binding
     * PreRenderViewEvent 在显示JSF页面之前触发。 可用于验证用户身份并提供对JSF View的受限访问。
     */
    public void handleEvent(ComponentSystemEvent event) {
        data = "Hello World";
    }

}
