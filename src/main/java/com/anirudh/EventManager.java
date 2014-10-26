package com.anirudh;

/**
 * Created by anirudh on 21/10/14.
 */
public interface EventManager {

    public void post(Event event);

    void register(LogType logType,Processor processor);

}
