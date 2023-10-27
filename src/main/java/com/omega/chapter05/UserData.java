package com.omega.chapter05;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Class UrlData
 *
 * @author KennySu
 * @date 2023/10/27
 */
@ManagedBean
@RequestScoped
@Data
public class UserData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String url;


}
