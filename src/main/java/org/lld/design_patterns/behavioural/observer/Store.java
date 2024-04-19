package org.lld.design_patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

interface Observable {
    void subscribe(NotificationObserver notificationObserver);

    void unSubscribe(NotificationObserver notificationObserver);

    void notifyConsumer();

    void addStock(int newStock);

    int getStockCount();
}

class IPhoneObservable implements Observable {
    private int stockCount;
    private List<NotificationObserver> observersList = new ArrayList<>();

    @Override
    public void subscribe(NotificationObserver notificationObserver) {
        observersList.add(notificationObserver);
    }

    @Override
    public void unSubscribe(NotificationObserver notificationObserver) {
        observersList.remove(notificationObserver);
    }

    @Override
    public void notifyConsumer() {
        for (NotificationObserver notificationObserver : observersList) {
            // notify observer
            notificationObserver.update();
        }
    }

    @Override
    public void addStock(int newStock) {
        stockCount += newStock;
        if (stockCount == newStock) {
            notifyConsumer();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}

interface NotificationObserver {
    void update();
}

class EmailNotificationObserver implements NotificationObserver {
    private String email;
    private Observable observable;

    public EmailNotificationObserver(String email, Observable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(email);
    }

    private void sendMail(String email) {
        System.out.println("mail sent to " + email + ", with new stock count:" + observable.getStockCount());
    }
}

class MobileNotificationObserver implements NotificationObserver {
    private String userName;
    private Observable observable;

    public MobileNotificationObserver(String userName, Observable observable) {
        this.userName = userName;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Text message sent to " + userName + ", with new Stock count:" + observable.getStockCount());
    }
}

public class Store{

    public static void main(String[] args) {
        Observable iphoneObservable = new IPhoneObservable();
        iphoneObservable.subscribe(new EmailNotificationObserver("kartikpawade25@gmail.com",iphoneObservable));
        iphoneObservable.subscribe(new EmailNotificationObserver("kartik.pawade.work@gmai.com",iphoneObservable));
        iphoneObservable.subscribe(new MobileNotificationObserver("kartik pawade", iphoneObservable));

        iphoneObservable.addStock(4);
    }
}
