package org.example.behavorial.chain.of.responsibility;

public class Main {
    public static void main(String[] args) {
        Middleware chain = Middleware.link(
                new ThrottleMiddleware(2),
                new UserExistsMiddleware(),
                new RoleCheckMiddleware()
        );

        UserService userService = new UserService(chain);
        userService.login("ng@ng1.com","12345");
        userService.login("ng@ng.com","admin");
        userService.login("ng@ng.com","admin");
    }
}
