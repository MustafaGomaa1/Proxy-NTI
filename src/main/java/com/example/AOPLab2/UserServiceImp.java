package com.example.AOPLab2;

import com.example.AOPLab2.proxy.Cachable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserService userService;

    @Cachable
    @Override
    public void SendMessage(String message) {
    System.out.println("INFO: SEND MESSAGE { "+message+"  }");
    }

    @Override
    public void SendTo(String message, String name) {
        userService.SendMessage(message);
        System.out.println("TO { "+name+"  }");
    }
}
