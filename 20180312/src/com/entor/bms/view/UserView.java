package com.entor.bms.view;

import com.entor.bms.entity.UserInfo;
import com.entor.bms.service.UserService;
import com.entor.bms.service.impl.UserServiceImpl;

import java.util.Scanner;

public class UserView {
    private Scanner sc = new Scanner(System.in);
    private UserService userService = new UserServiceImpl();

    public UserView() {
        // 欢迎页面
        welcome();
    }

    /**
     * 欢迎页
     */
    private void welcome() {
        System.out.println("+++++欢迎使用图书馆里系统+++++");
        System.out.println("+++++1.用户注册                  +++++");
        System.out.println("+++++2.登录系统                  +++++");
        System.out.println("+++++3.退出系统                  +++++");

        while (true) {
            System.out.println("请输入选项：");
            String option = sc.next();
            if ("1".equals(option)) {// 跳转注册页
                register();
                return;
            }

            if ("2".equals(option)) {// 跳转登录页

                return;
            }

            if ("3".equals(option)) {// 退出系统
                System.exit(0);
            }

            System.out.println("请输入正确的选项！");
        }
    }

    /**
     * 注册
     */
    private void register() {
        System.out.println("+++++注册页面+++++");
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入证件号：");
        String idCard = sc.next();

        // 数据封装到对象
        UserInfo userInfo = new UserInfo();
        userInfo.setUid(1);
        userInfo.setName(name);
        userInfo.setIdCard(idCard);
        userInfo.setStatus(0);

        userInfo.getRentBooks().add(1);
        userInfo.getRentBooks().add(2);
        userInfo.getRentBooks().add(3);
        userInfo.getRentBooks().add(4);

        // 保存数据对象
        userService.saveUser(userInfo);
        System.out.println("注册成功！");
    }
    
    


}
