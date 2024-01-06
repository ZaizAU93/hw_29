package OpenClosed;

import DependencyInversion.DescriptionUser;
import InterfaceSegregation.SubmitComment;
import SingleResponsibility.User;

public class RegularUser extends User implements   SubmitComment, DescriptionUser {

    public RegularUser(int id, String userName, String password) {
        super(id, userName, password);
    }

    @Override
    public void action() {
        System.out.println("действие для обычного пользователя");
    }


    @Override
    public void submitComment() {
        System.out.println("обычный пользователь оставил комментарий");
    }

    public void description() {
        System.out.println("Информация об обычном госте");
        action();
    }

}
