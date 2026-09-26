package com.example.AOPLab;

public class UserServiceImp implements UserService {

    @Override
    public void createUser(String username) {
        System.out.println("Welcome: " + username);
    }

    @Override
    public void deleteUser() {
        System.out.println("User Deleted!!");
    }

    @Override
    public void updateUser(String username) {
        System.out.println("Updated User {" + username + "} Information!");
    }

    @Override
    public void showUser(String username, int age, String email) {
        System.out.println("User {" + username + "} \nAge {" + age + "}\nEmail {" +
                email + "}");
    }

}
