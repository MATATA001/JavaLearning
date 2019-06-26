package com.cx.java.ioProgramming;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class WriteLogToFile {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(WriteLogToFile.class.getName());
        // Create an instance of FileHandler that write log to a file called
        // app.log. Each new message will be appended at the at of the log file.
        FileHandler fileHandler = new FileHandler("app.log", true);
        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.info("WHAT IS DIFF");
        logger.warning("warning");

        if (logger.isLoggable(Level.INFO)) {
            logger.info("Information message");
            logger.info("这是什么？just testing");
        }

        if (logger.isLoggable(Level.WARNING)) {
            logger.warning("Warning message");
        }

    }
//public static void main(String[] args) {
//
//    Logger logger = Logger.getLogger("MyLog");
//    FileHandler fh;
//
//    try {
//
//        // This block configure the logger with handler and formatter
//        fh = new FileHandler("app.log",true);
//        logger.addHandler(fh);
//        SimpleFormatter formatter = new SimpleFormatter();
//        fh.setFormatter(formatter);
//
//        // the following statement is used to log any messages
//        logger.info("My first log");
//
//    } catch (SecurityException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//    logger.info("Hi How r u?");
//
//}
}
