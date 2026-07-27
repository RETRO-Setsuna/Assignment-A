
import java.util.ArrayList;
import java.util.HashMap;

class Users {
    private String name;
    private String phoneNumber;

    Users(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    String getName() {
        return name;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return "Name: " + name + "    Phone Number: " + phoneNumber;
    }
}


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

    public Passwords(String value, String userTypes) {
        super(userTypes);
    }

    void passwordchecker() {
        if (!requirment.satisfaction("12345678")) {
            System.out.println("Passowrd must be longer than 8 characters");
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