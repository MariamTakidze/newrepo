package com.solvd.threadpool;

import com.solvd.threading.threadcreation.MyThreadImplementsRunnable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThreadPoolMain {
    private static final Logger LOGGER = LogManager.getLogger(ThreadPoolMain.class);
        public static void main(String[] args) throws Exception {


            ThreadPool myThreadPool = new ThreadPool(7, 20);

            for(int i=1; i<20; i++) {

                int taskNum = i;
                myThreadPool.execute( () -> {
                    String msg =
                            Thread.currentThread().getName()
                                    + ": Task " + taskNum ;
//                    System.out.println(msg);
                    LOGGER.info(msg);
                });
            }

            myThreadPool.waitUntilAllTasksFinished();
            myThreadPool.stop();

        }

}
