package com.solvd.threading.threadcreation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThreadImplementsRunnable implements Runnable{
    private static final Logger LOGGER = LogManager.getLogger(MyThreadImplementsRunnable.class);
    @Override
    public void run(){
        for(int i=0; i<3;i++)
            LOGGER.info(i);
    }


}
