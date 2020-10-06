package com.itheima.domain;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * com.itheima.domain
 *
 * @Author Administrator
 * @date 11:16
 */
public class SysUserTest {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123"));
    }

}
