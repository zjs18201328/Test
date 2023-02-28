package com.iflytek.xxsystem.listener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
@WebListener
public class HttpSessionBindTest implements HttpSessionBindingListener {
    private int count;//记录session的数量
    public int getCount() {
        return count;
    }

    public HttpSessionBindTest() {

    }
    //监听session的创建
    public void valueBound(HttpSessionBindingEvent sce)  {
        //登录
        System.out.println("登录 value Bound");
        count++;

    }
    //监听session的撤销
    public void valueUnbound(HttpSessionBindingEvent sce)  {
        //退出
        System.out.println("退出 value Unbound");
        count--;
    }

}
