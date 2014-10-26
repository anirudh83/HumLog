package com.anirudh;

/**
 * Created by anirudh on 21/10/14.
 */
public class EventManagerFactory {

    private static EventManager INSTANCE =  new LogEventManager();

    public static EventManager getLogEventManager(){
        return INSTANCE;
    }
}
