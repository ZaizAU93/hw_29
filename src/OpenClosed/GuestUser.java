package OpenClosed;

import DependencyInversion.DescriptionUser;
import InterfaceSegregation.SubmitComment;
import SingleResponsibility.User;

public class GuestUser extends User implements  SubmitComment, DescriptionUser {

    public GuestUser(int id, String userName, String password) {
        super(id, userName, password);
    }

    @Override
    public void action() {
        System.out.println("�������� ��� �����");
    }

    @Override
    public void submitComment() {
        System.out.println("������� ������������ ������� �����������");
    }


    @Override
    public void description() {
        System.out.println("���������� � �����");
        action();
    }
}
