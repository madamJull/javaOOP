package org.example.seminar_2.cw_2;

import org.example.seminar_2.cw_1.Actor;

public class Human extends Actor {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        makeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        takeOrder = true;
    }
}
