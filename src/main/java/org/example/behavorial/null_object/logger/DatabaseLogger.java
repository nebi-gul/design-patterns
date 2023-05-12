package org.example.behavorial.null_object.logger;

public class DatabaseLogger implements ILogger{
    @Override
    public void log() {
        System.out.println("Database loglandı...");
    }
}
