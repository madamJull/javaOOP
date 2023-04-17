package org.example.seminar_2.cw_1.model;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;
    public boolean isMakeOrder(){
        return makeOrder;
    }
    public boolean isTakeOrder(){
        return takeOrder;
    }
    public  abstract String getName();

}
