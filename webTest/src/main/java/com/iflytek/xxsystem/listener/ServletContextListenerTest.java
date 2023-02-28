package com.iflytek.xxsystem.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextListenerTest implements ServletContextListener {
    public ServletContextListenerTest() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        HttpSessionBindTest sessionbinder = new HttpSessionBindTest();
        sce.getServletContext().setAttribute("counter",sessionbinder);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //ServletContextListener.super.contextDestroyed(sce);
    }
}
