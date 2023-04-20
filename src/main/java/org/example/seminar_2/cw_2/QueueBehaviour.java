package org.example.seminar_2.cw_2;

public interface QueueBehaviour {
    public void takeInQueue(Human human);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
