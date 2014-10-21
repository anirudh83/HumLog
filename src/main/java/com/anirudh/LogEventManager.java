package com.anirudh;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by anirudh on 21/10/14.
 */
public class LogEventManager implements EventManager {

    BlockingQueue<Event> eventQueue = new LinkedBlockingDeque<Event>();

    @Override
    public void post(Event event) {
        eventQueue.add(event);
    }

}
