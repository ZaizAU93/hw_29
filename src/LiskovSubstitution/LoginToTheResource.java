package LiskovSubstitution;
import SingleResponsibility.*;


public class LoginToTheResource {
    User user;

    public String  login(User user){
        if (user.getPassword().equals("derParol")){
            return "SuperAdmin �����";
        } else
            System.out.println(user.getClass());
    return "���-�� ����-�� �����";
    }
}
