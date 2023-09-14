package com.Assignment.User.management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    List<UserManage> UserList;

    //create Users -Post APIs

    //add a User
    @PostMapping("User")
    public String addUser(@RequestBody UserManage u)
    {
         UserList.add(u);
        return "added User";
    }


    @GetMapping("Users")
    public List<UserManage> getAllUsers()
    {
        return UserList;
    }

    @GetMapping("getUser/{userId}")
    public String  getUserById(@PathVariable Integer UserId){
        for(UserManage user1 : UserList){
            if(user1.getUserId().equals(UserId)){
                return "existing UserId" + user1;
            }
        }
        return "Invalid UserId";
    }

    @PutMapping("updateUserInfo/{userId}/{Name}")
    public String UpdateUser(@PathVariable Integer userId, @PathVariable String Name){
        for(UserManage user3 : UserList){
            if(user3.getUserId().equals(userId)){
                user3.setName(Name);
                return "User name updated to " + Name;
            }
        }
        return "Invalid id";
    }

    @DeleteMapping("deleteUser/id/{id}")
    public String removeUserId(@PathVariable Integer id) {
        for (UserManage user2 : UserList){
            if(user2.getUserId().equals(id)){
                UserList.remove(user2);
                return "Users: " + id + " remove";
            }
        }
        return "Invalid id";
    }

}
