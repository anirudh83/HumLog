package com.anirudh;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by anirudh on 26/10/14.
 */
public class EventConsumer implements Runnable {

    private BlockingQueue<Event> eventQueue;
    private boolean shutdown = true;
    private Thread executorThread;
    private Map<LogType, Processor> logTypeProcessorMap;

    public EventConsumer(BlockingQueue<Event> eventQueue, boolean shutdown, Map<LogType, Processor> logTypeProcessorMap) {
        this.eventQueue = eventQueue;
        this.shutdown = shutdown;
        this.logTypeProcessorMap = logTypeProcessorMap;
    }

    @Override
    public void run() {
        while (!shutdown) {
            try {
                Event event = eventQueue.take();
                Processor processor = logTypeProcessorMap.get(event.getLogType());
                executorThread = new Thread(new EventExecutor(processor, event));
                executorThread.start();

            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("ERROROROROREEERRR!!!");
            }
        }

    }

    public void destroy() {
        shutdown = true;
        executorThread.interrupt();
    }

}
