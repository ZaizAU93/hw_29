package DependencyInversion;

public class UserService {
    DescriptionUser descriptionUser;

    public UserService(DescriptionUser descriptionUser) {
        this.descriptionUser = descriptionUser;
    }

    public void displayUser(){
        descriptionUser.description();
    }

}
