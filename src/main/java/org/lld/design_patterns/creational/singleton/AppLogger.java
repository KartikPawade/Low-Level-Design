package org.lld.design_patterns.creational.singleton;

public class AppLogger {
    int a;
    private static AppLogger appLogger;

    private AppLogger() {
    }

    public static AppLogger getInstance() {
        /**
         * But if two threads try to get this object simultaneously, then at that, two objects get created.         *
         */
        if (appLogger == null) {
            appLogger = new AppLogger();
        }
        return appLogger;
    }

    public static AppLogger getInstance2(){

        if(appLogger==null){
            synchronized (AppLogger.class){
                if(appLogger==null){
                    appLogger = new AppLogger();
                }
            }
        }
        return appLogger;
    }
}



class Main {
    public static void main(String[] args) {
        AppLogger appLogger = AppLogger.getInstance();
        appLogger.a = 10;

        AppLogger appLogger1 = AppLogger.getInstance();
        System.out.println(appLogger1.a);// Even second object is referring to same instance.


    }
}
