package org.example.behavorial.chain.of.responsibility;

public class RoleCheckMiddleware extends Middleware{

    @Override
    public boolean check(String email, String password) {
        System.out.println("RoleCheck Kontrol Ediliyor.");
        if(email != "nb.com" && password != "admin")
        return false;
        return checkNext(email,password);
    }
}
