package com.omega.chapter05;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.Date;

/**
 * Class ConvertTagsController
 *
 * @author KennySu
 * @date 2023/10/27
 */
@ManagedBean
@RequestScoped
public class ConvertDateTimeController implements Serializable {

    private static final long serialVersionUID = 1L;

    public Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

