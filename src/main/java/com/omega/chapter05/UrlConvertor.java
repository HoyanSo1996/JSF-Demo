package com.omega.chapter05;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Class UrlConvertor
 * 自定义转换器
 *
 * @author KennySu
 * @date 2023/10/27
 */
@FacesConverter("com.omega.chapter.UrlConverter")
public class UrlConvertor implements Converter<Object> {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        StringBuilder url = new StringBuilder();
        if(!value.startsWith("http://", 0)) {
            url.append("http://");
        }
        url.append(value).append(".com");

        try {
            new URI(url.toString());

        } catch (URISyntaxException e) {
            FacesMessage msg = new FacesMessage(
                    "Error converting URL",
                    "Invalid URL format");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(msg);
        }

        return url.toString();
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        return value.toString();
    }
}
