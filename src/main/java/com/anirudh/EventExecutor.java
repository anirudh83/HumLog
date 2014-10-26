package com.anirudh;

/**
 * Created by anirudh on 26/10/14.
 */
public class EventExecutor implements Runnable {

    private Event event;
    private Processor processor;

    public EventExecutor(Processor processor,Event event) {
        this.event = event;
        this.processor=processor;
    }

    @Override
    public void run() {
        processor.execute(event);
    }
}
