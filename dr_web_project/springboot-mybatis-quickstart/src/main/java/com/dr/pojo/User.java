package com.dr.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author DR
 * @Date 2023/8/6
 */

@Data
@NoArgsConstructor  //无参构造
@AllArgsConstructor  //有参构造
public class User {

    private Integer id;
    private String name;
    private short age;
    private short gender;
    private String phone;

//    public User() {
//    }
//
//    public User(Integer id, String name, short age, short gender, String phone) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.phone = phone;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public short getAge() {
//        return age;
//    }
//
//    public void setAge(short age) {
//        this.age = age;
//    }
//
//    public short getGender() {
//        return gender;
//    }
//
//    public void setGender(short gender) {
//        this.gender = gender;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                ", phone='" + phone + '\'' +
//                '}';
//    }
}
