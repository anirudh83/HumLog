package com.anirudh;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by anirudh on 21/10/14.
 */
public class LogEventManager implements EventManager {

    private BlockingQueue<Event> eventQueue = new LinkedBlockingDeque<Event>();
    private Map<LogType, Processor> logTypeProcessorMap = new ConcurrentHashMap<LogType, Processor>();


    //As soon as log Event Manager is initialised, a new thread of Event Consumer starts to listen to event queue.
    public LogEventManager() {
        new Thread(new EventConsumer(eventQueue, false, logTypeProcessorMap)).start();
    }

    @Override
    public void post(Event event) {
        eventQueue.add(event);
    }

    @Override
    public void register(LogType logType,Processor processor) {
        logTypeProcessorMap.put(logType, processor);
    }

}
