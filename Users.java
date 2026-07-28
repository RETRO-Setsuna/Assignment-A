
import java.util.List;
import java.util.Map;


interface Requirment {
    boolean satisfaction(String values);
}

class MiniReq implements Requirment {

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


class logInCredentials {
    private String userTypes;

    logInCredentials(String userTypes) {
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

class Passwords extends logInCredentials {
    static final int minilent = 8;
    static Requirment requirment = new MiniReq(minilent);

    Passwords(String userTypes) {
        super(userTypes);
    }

    boolean passwordchecker() {
        if (!requirment.satisfaction(getUserTypes())) {
            System.out.println("Passowrd must be longer than 8 characters");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getUserTypes() {
        return super.getUserTypes();
    }

    @Override
    public void setUserTypes(String userTypes) {
        super.setUserTypes(userTypes);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}

class Usernames extends logInCredentials {

    Usernames(String userTypes) {
        super(userTypes);
    }

    @Override
    public String getUserTypes() {
        return super.getUserTypes();
    }

    @Override
    public void setUserTypes(String userTypes) {
        super.setUserTypes(userTypes);
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

    public void setUName(Usernames uName) {
        this.uName = uName;
    }

    public Passwords getPass() {
        return uPass;
    }

    public void setUPass(Passwords uPass) {
        this.uPass = uPass;
    }

    public String toString() {
        return "Name: " + uName + "    Password: " + uPass;
    }
}


class listOfUsers {
    private Map<Usernames, Passwords> users;
    private List<Users> listUsers;

    listOfUsers(Map<Usernames, Passwords> users, List<Users> listOfUsers) {
        this.users = users;
        this.listUsers = listOfUsers;
    }
    

    public void signUp(String uNameStr, String uPassStr) {
        Usernames username = new Usernames(uNameStr);
        Passwords password = new Passwords(uPassStr);

        while (true) { 
            try {
                if (password.passwordchecker()) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "Make sure password is 8 character long");
            }    
        }
        users.put(username, password);
        listUsers.add(new Users(username, password));
        System.out.println("Your account has been created");
        
    }

    public boolean signIn(String accountName, String accountPassword) {
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