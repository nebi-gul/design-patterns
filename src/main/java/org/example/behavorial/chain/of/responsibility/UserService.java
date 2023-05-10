package org.example.behavorial.chain.of.responsibility;

public class UserService {
    private Middleware middleware;

    public UserService(Middleware middleware) {
        this.middleware = middleware;
    }
    public void login(String email, String password) {
        try {
            if (this.middleware.check(email, password)) {
                System.out.println("Giriş yapıldı");
                return;
            }
        } catch (RuntimeException e) {
            System.out.println("Giriş Başarısız: " + e.getMessage());
        }
        System.out.println("Giriş Başarısız");
    }
}
