package log;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {

    private int count;

    @Override
    public void log(String msg) {
        count++;
        String logLevel;
        if (msg.toUpperCase().contains("ERROR")) {
            logLevel = "ERROR";
        } else {
            logLevel = "INFO";
        }
        System.out.println(logLevel + "#" + count + " " + "[" + LocalDateTime.now() + "]" + " " + msg);
    }
}