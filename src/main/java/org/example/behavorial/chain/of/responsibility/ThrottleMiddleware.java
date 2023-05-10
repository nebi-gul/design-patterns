package org.example.behavorial.chain.of.responsibility;

public class ThrottleMiddleware  extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottleMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    @Override
    public boolean check(String email, String password) {
        System.out.println("Throttle Kontrol Ediliyor...");
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }
        request++;

        if (request > requestPerMinute) {
            System.out.println("Request Sayısı Aşıldı...");
            Thread.currentThread().interrupt();
        }
        return checkNext(email, password);
    }
}