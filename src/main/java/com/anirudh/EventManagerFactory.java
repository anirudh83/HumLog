package com.anirudh;

/**
 * Created by anirudh on 21/10/14.
 */
public class EventManagerFactory {

    public EventManager getLogEventManager(){
        return new LogEventManager();
    }
}
