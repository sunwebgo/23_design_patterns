package com.xha.patterns.behaviour.mediator;

/**
 * 具体同事类
 *
 * @author Xu huaiang
 * @date 2023/07/15
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message){
        mediator.constact(message, this);
    }

    public void getMessage(String message){
        System.out.println("租房者:" + name + ",获得信息：" + message);
    }
}
