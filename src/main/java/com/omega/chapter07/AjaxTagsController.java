package com.omega.chapter07;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Class User
 *
 * @author KennySu
 * @date 2023/10/27
 */
@ManagedBean
@RequestScoped
@Data
public class AjaxTagsController implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getWelcomeMessage() {
        return (name == null || "".equals(name)) ? "" : "Hello " + name;
    }

    public String getSuccessMessage() {
        return (name == null || "".equals(name)) ? "" : "Ajax执行成功";
    }
}

