package com.solvd.threading.threadcreation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThreadExtendsThread extends Thread {
    private static final Logger LOGGER = LogManager.getLogger(MyThreadExtendsThread.class);
    public void run(){
        LOGGER.info("My Thread is running");
        LOGGER.info("My Thread is finished");
    }

}


