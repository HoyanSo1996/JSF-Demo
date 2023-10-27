package com.omega.chapter06;

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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private double salary;
    private String email;

}
