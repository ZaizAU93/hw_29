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
        System.out.println("дейсвие которое может выполнить только админисстратор");
     }

    @Override
    public void actionAdmin() {
        System.out.println("Какое-то действие для админа");
    }

    public void description() {
        System.out.println("Информация об обычном админе");
        action();
    }

    //Применение основных принциопов ООП
    // Классы должны быть закрыты для изменения но открыты для расширения
}
