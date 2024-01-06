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
        System.out.println("�������� ��� �������� ������������");
    }


    @Override
    public void submitComment() {
        System.out.println("������� ������������ ������� �����������");
    }

    public void description() {
        System.out.println("���������� �� ������� �����");
        action();
    }

}
