package com.cx.java;

import java.util.logging.Logger;

public class TestJar {
    private static Logger logger = Logger.getLogger(TestJar.class.getName());
    public static void main(String[] args){
        String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
        String processID = processName.substring(0,processName.indexOf('@'));
        logger.info("------------jar is running----------");
        logger.info("processName: "+processName);
        logger.info("processID: "+processID);
        Thread thread = Thread.currentThread();
        logger.info("currentThread: "+thread.getName());
    }
}
