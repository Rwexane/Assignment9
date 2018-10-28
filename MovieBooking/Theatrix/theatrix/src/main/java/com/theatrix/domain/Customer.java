package com.theatrix.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Customer implements Serializable
{

    public Customer(Long id) {
        this.customer_ID = id;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_ID;
    private String name;
    private String surname;
    private String cellphone;
    private String email;
    private String age;
    private String password;

    //***************************************Setters*******************************************


    public void setId(Long id) {
        this.customer_ID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //***************************************Getters*******************************************


    public Long getId() {
        return customer_ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }



    private Customer(Builder builder)
    {
        this.customer_ID = builder.IDno;
        this.name = builder.name;
        this.surname = builder.surname;
        this.cellphone = builder.cellphone;
        this.email = builder.email;
        this.age = builder.age;
        this.password = builder.password;

    }


    public static class Builder {

        Long IDno;
        private String name, surname, cellphone, email, age, password;


        public Builder id(Long n) {
            this.IDno = n;
            return this;
        }
        public Builder nameVal(String n) {
            this.name = n;
            return this;
        }


        public Builder surnameVal(String sn) {
            this.surname = sn;
            return this;
        }

        public Builder phoneNumVal(String phone) {
            this.cellphone = phone;
            return this;
        }

        public Builder emailVal(String email) {
            this.email = email;
            return this;
        }

        public Builder ageVal(String age) {
            this.age = age;
            return this;
        }

        public Builder passwordVal(String pass) {
            this.password = pass;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }


}
