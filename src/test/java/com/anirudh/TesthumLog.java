package com.anirudh;

import org.junit.Test;

/**
 * Created by anirudh on 21/10/14.
 */
public class TesthumLog {

    HumLog LOGGER =  new HumLog().getLogger();

    @Test
    public void testHumLog(){
        LOGGER.log("This is a debug message",LogType.DEBUG);
    }

}
