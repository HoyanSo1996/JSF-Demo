package com.omega.demo02;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Class NavigationController
 *
 * @author KennySu
 * @date 2023/10/26
 */
@ManagedBean
@RequestScoped
public class NavigationController implements Serializable {

    private static final long serialVersionUID = 1L;

    public String moveToPage1() {
        return "Page1";
    }

    public String moveToPage2() {
        return "Page2";
    }

    public String moveToHomePage() {
        return "home";
    }


    // this managed property will read value from request parameter pageId
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String showPage() {
        switch (pageId) {
            case "1":
                return "Page1";
            case "2":
                return "Page2";
            default:
                return "HomePage";
        }
    }

    public String processPage1() {
        return "Page1";
    }
    public String processPage2() {
        return "Page2";
    }
}
