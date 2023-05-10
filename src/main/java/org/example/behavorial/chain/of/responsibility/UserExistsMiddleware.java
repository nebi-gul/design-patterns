package org.example.behavorial.chain.of.responsibility;

public class UserExistsMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        System.out.println("UserExists Kontrol Ediliyor...");
        if(email != "admin@nebi.com" && email != "admin@nebi.com")
        return false;
        return checkNext(email,password);
    }
}
