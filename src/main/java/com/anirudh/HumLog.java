package com.anirudh;


/**
 * Created by anirudh on 21/10/14.
 */
public class HumLog {

    private static HumLog INSTANCE = new HumLog();
    private static EventManager eventManager;


    public static HumLog getLogger() {
        eventManager = EventManagerFactory.getLogEventManager();
        eventManager.register(LogType.DEBUG,new LogProcessor());
        return INSTANCE;
    }



    public void log(String message, LogType logType) {
        Event logEvent = new Event(message, logType);
        eventManager.post(logEvent);
    }
}
