
package com.employee.crud.data;





import com.employee.crud.entity.User;



import java.util.ArrayList;

import java.util.List;



public class UserData {

    public static List<User> userData() {

        List<User> userList = new ArrayList<>();

        User user0 = new User(0, "С��", 20, "��");

        User user1 = new User(1, "С��", 19, "Ů");

        User user2 = new User(2, "С��", 15, "��");

        User user3 = new User(3, "С��", 16, "Ů");

        User user4 = new User(4, "С��", 15, "Ů");



        userList.add(user0);

        userList.add(user1);

        userList.add(user2);

        userList.add(user3);

        userList.add(user4);



        return userList;



    }



}