package com.anirudh;

import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

/**
 * Created by anirudh on 21/10/14.
 */
public class TesthumLog {

    HumLog LOGGER =  HumLog.getLogger();

    @Test
    public void testHumLog(){
        LOGGER.log("This is a debug message1",LogType.DEBUG);
        LOGGER.log("This is a debug message2",LogType.DEBUG);
        LOGGER.log("This is a debug message3",LogType.DEBUG);
        LOGGER.log("This is a debug message4",LogType.DEBUG);

    }

}
