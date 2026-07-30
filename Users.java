
import java.util.List;
import java.util.Map;

interface Requirement {
    boolean satisfaction(String values);
}

class MiniReq implements Requirement {

    int miniLen;

    MiniReq(int miniLen) {
        this.miniLen = miniLen;
    }

    @Override
    public boolean satisfaction(String values) {
        if (values.length() >= miniLen) {
            return true;
        } else {
            return false;
        }
    }

}

class LogInCredentials {
    private String userTypes;

    LogInCredentials(String userTypes) {
        this.userTypes = userTypes;
    }

    public String getUserTypes() {
        return this.userTypes;
    }

    public void setUserTypes(String userTypes) {
        this.userTypes = userTypes;
    }

    public String toString() {
        return userTypes;
    }

}

class Passwords extends LogInCredentials {
    static final int miniLength = 8;
    static Requirement requirement = new MiniReq(miniLength);

    Passwords(String userTypes) {
        super(userTypes);
    }

    boolean passwordchecker() {
        if (!requirement.satisfaction(getUserTypes())) {
            System.out.println("Password must be longer than 8 characters");
            return false;
        } else {
            return true;
        }
    }
}

class Usernames extends LogInCredentials {

    Usernames(String userTypes) {
        super(userTypes);
    }

}

class Users {
    private Usernames uName;
    private Passwords uPass;

    Users(Usernames uName, Passwords uPass) {
        this.uName = uName;
        this.uPass = uPass;
    }

    public Usernames getName() {
        return uName;
    }


    public Passwords getPass() {
        return uPass;
    }


    public String toString() {
        return "Name: " + uName + "    Password: " + uPass;
    }
}

class ListOfUsers {
    private Map<Usernames, Passwords> users;
    private List<Users> listUsers;

    ListOfUsers(Map<Usernames, Passwords> users, List<Users> listOfUsers) {
        this.users = users;
        this.listUsers = listOfUsers;
    }

    public void SignUp(String uNameStr, String uPassStr) {
        Usernames username = new Usernames(uNameStr);
        Passwords password = new Passwords(uPassStr);

        boolean temp = true;

        while (temp == true) {
            try {
                if (password.passwordchecker()) {
                    break;
                } else {
                    System.out.print("Please try again: ");
                    password.setUserTypes(In.nextLine());
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "Make sure password is 8 character long");
                temp = false;
            }
        }
        users.put(username, password);
        listUsers.add(new Users(username, password));
        System.out.println("Your account has been created");

    }

    public boolean SignIn(String accountName, String accountPassword) {
        boolean temp = false;
        for (Users u : listUsers) {
            if (accountName.equals(u.getName().getUserTypes())) {
                if (accountPassword.equals(u.getPass().getUserTypes())) {
                    temp = true;
                } else {
                    System.out.println("Wrong password or Username, Please try again");
                }
            }
        }
        return temp;
    }
}