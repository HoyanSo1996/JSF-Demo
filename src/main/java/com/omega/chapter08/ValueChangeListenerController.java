package com.omega.chapter08;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class EventHandlingController
 *
 * @author KennySu
 * @date 2023/10/27
 */
@ManagedBean
@SessionScoped
@Data
public class ValueChangeListenerController implements Serializable {

    private static final long serialVersionUID = 1L;

    private static Map<String,String> countryMap;

    private String selectedCountry = ""; //default value

    static {
        countryMap = new LinkedHashMap<>();
        countryMap.put("en", "United Kingdom"); //locale, country name
        countryMap.put("fr", "French");
        countryMap.put("de", "German");
    }

    /**
     * Tip: ui component不能通过getCountryMap()方法来获得数组, 必须新写一个方法
     */
    public Map<String, String> getCountries() {
        return countryMap;
    }

    public void localeChanged(ValueChangeEvent e) {
        //assign new value to country
        selectedCountry = e.getNewValue().toString();
    }

}
