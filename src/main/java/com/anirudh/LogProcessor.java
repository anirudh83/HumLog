package com.anirudh;

/**
 * Created by anirudh on 21/10/14.
 */
public class LogProcessor implements Processor {

    private EventManager eventManager;

    @Override
    public void execute(Event event) {
        System.out.println(event.getLogType() + " Message Received " + event.getMessage());
    }

    @Override
    public void shutdown() {

    }

}
