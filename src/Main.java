import DependencyInversion.DescriptionUser;
import DependencyInversion.UserService;
import LiskovSubstitution.LoginToTheResource;
import OpenClosed.GuestUser;
import OpenClosed.UserAdmin;
import SingleResponsibility.User;


public class Main {
    public static void main(String[] args) {
        LoginToTheResource loginToTheResource = new LoginToTheResource();

        User user = new User(1, "SuperAdmin", "derParol");
        System.out.println(loginToTheResource.login(user));
        UserAdmin userAdmin = new UserAdmin(1, "Admin", "derParo");
        System.out.println(loginToTheResource.login(userAdmin));
        User guest = new GuestUser(1, "гость", "derParo");
        System.out.println(loginToTheResource.login(guest));
        GuestUser guestUser = new GuestUser(1, "гость", "derParo");

        System.out.println("DependencyInversion");
        UserService userService = new UserService(userAdmin);
        userService.displayUser();
        UserService userService1 = new UserService(guestUser);
        userService1.displayUser();

    }
}