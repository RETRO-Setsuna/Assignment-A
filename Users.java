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
        return "Name: " + name + "Phone Number: " + phoneNumber;
    }
}