package com.example.AOPLab;

public interface UserService {

    void createUser(String username);

    void deleteUser();

    void updateUser(String username);

    default void showUser(String username, int age, String email) {
        System.out.println("Private Method");
    }
}
