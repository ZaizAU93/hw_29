package OpenClosed;
import DependencyInversion.DescriptionUser;
import InterfaceSegregation.ActionAdmin;
import SingleResponsibility.User;

public class UserAdmin extends User implements ActionAdmin, DescriptionUser {


    public UserAdmin(int id, String userName, String password) {
        super(id, userName, password);
    }

    @Override
    public void action() {
        System.out.println("������� ������� ����� ��������� ������ ��������������");
     }

    @Override
    public void actionAdmin() {
        System.out.println("�����-�� �������� ��� ������");
    }

    public void description() {
        System.out.println("���������� �� ������� ������");
        action();
    }

    //���������� �������� ���������� ���
    // ������ ������ ���� ������� ��� ��������� �� ������� ��� ����������
}
