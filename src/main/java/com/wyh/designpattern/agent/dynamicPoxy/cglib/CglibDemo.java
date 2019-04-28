package com.wyh.designpattern.agent.dynamicPoxy.cglib;

import com.wyh.designpattern.agent.staticPoxy.Girl;
import com.wyh.designpattern.agent.staticPoxy.TeacherCang;
import net.sf.cglib.proxy.Enhancer;

public class CglibDemo {
    public static void main(String[] args) {
        Enhancer e = new Enhancer();
        TeacherCang tc = new TeacherCang();
        // 设置增强回调
        e.setCallback(new MyMethodInterceptor(tc));
        // 获得接口代理对象
        e.setInterfaces(new Class[]{Girl.class});
        Girl g = (Girl) e.create();
        g.dating(1.8f);
        // 对类生成代理对象
        e.setSuperclass(TeacherCang.class);
        e.setInterfaces(null);
        //当有多个callback时，需要通过callbackFilter来指定被代理方法使用第几个callback

        /* e.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {
            return 0;
            }
        });*/
        TeacherCang proxy = (TeacherCang) e.create();
        proxy.dating(1.8f);
    }
}
