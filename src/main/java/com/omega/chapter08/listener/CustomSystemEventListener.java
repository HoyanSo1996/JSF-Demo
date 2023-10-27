package com.omega.chapter08.listener;

import javax.faces.application.Application;
import javax.faces.event.*;

/**
 * Class CustomSystemEventListener
 *
 * @author KennySu
 * @date 2023/10/30
 */
public class CustomSystemEventListener implements SystemEventListener {

    @Override
    public boolean isListenerForSource(Object value) {
        //only for Application
        return (value instanceof Application);
    }

    @Override
    public void processEvent(SystemEvent event) throws AbortProcessingException {
        // 应用程序启动时触发。 应用程序启动后可用于执行初始化任务。
        if(event instanceof PostConstructApplicationEvent) {
            System.out.println("Application Started...");
            System.out.println("PostConstructApplicationEvent occurred!");
        }

        // 应用程序即将关闭时触发。 可用于在应用程序即将关闭之前执行清理任务。
        if(event instanceof PreDestroyApplicationEvent) {
            System.out.println("PreDestroyApplicationEvent occurred!");
            System.out.println("Application is stopping...");
        }
    }
}
