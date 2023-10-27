package com.omega.chapter08.listener;


import com.omega.chapter08.ActionChangeListenerController;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

/**
 * Class DataChangeListener
 *
 * @author KennySu
 * @date 2023/10/30
 */
public class CustomActionListener implements ActionListener {

    @Override
    public void processAction(ActionEvent actionEvent) throws AbortProcessingException {
        //access userData bean directly
        ActionChangeListenerController actionChangeListenerController =
                (ActionChangeListenerController) FacesContext
                        .getCurrentInstance()
                        .getExternalContext()
                        .getSessionMap().get("actionChangeListenerController");

        actionChangeListenerController.decrease();
    }
}
