package com.anirudh;

/**
 * Created by anirudh on 21/10/14.
 */
public class HumLog {

    public HumLog getLogger(){
        return new HumLog();
    }

    EventManager eventManager = new EventManagerFactory().getLogEventManager();

    public void log(String message,LogType logType){
        Event logEvent = new Event(message,logType);
        eventManager.post(logEvent);
    }
}
