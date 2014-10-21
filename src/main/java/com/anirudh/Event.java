package com.anirudh;

/**
 * Created by anirudh on 21/10/14.
 */
public class Event {

    private String message;
    private LogType logType;

    public Event(String message, LogType logType) {
        this.message = message;
        this.logType = logType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }
}
