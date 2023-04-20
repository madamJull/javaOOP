package org.example.seminar_2.cw_2;
/**
 * 1. Интерфейс ActorBehaviour, который будет содержать описание возможных действий актора в очереди/магазине
 * 2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать заказ и факт получения заказа.
 * Дополнение: для большего понимания у студентов, можно сделать методы-геттеры для имени и прочих “персональных данных” abstract
 * 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market mac = new Market();
        mac.acceptToMarket(human);
        mac.takeInQueue(human);
        mac.takeOrders();
        mac.giveOrders();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);
    }
}