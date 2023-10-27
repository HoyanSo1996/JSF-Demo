package com.omega.chapter08.listener;

import com.omega.chapter08.ValueChangeListenerController;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 * Class LocaleChangeListener
 *
 * @author KennySu
 * @date 2023/10/27
 */
public class CustomValueChangeListener implements ValueChangeListener {

    @Override
    public void processValueChange(ValueChangeEvent valueChangeEvent) throws AbortProcessingException {
        //access country bean directly
        ValueChangeListenerController valueChangeListenerController =
                (ValueChangeListenerController) FacesContext
                        .getCurrentInstance()
                        .getExternalContext()
                        .getSessionMap().get("valueChangeListenerController");

        valueChangeListenerController.setSelectedCountry(valueChangeEvent.getNewValue().toString());
    }
}
