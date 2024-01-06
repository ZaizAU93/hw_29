package LiskovSubstitution;
import SingleResponsibility.*;


public class LoginToTheResource {
    User user;

    public String  login(User user){
        if (user.getPassword().equals("derParol")){
            return "SuperAdmin вошел";
        } else
            System.out.println(user.getClass());
    return "кто-то куда-то вошел";
    }
}
