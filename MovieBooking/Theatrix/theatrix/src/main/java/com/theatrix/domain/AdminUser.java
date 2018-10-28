package com.theatrix.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class AdminUser implements Serializable
{

    public AdminUser(Long id) {
        this.id = id;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    private String password;

    //***************************************Setters*******************************************

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //***************************************Getters*******************************************


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    private AdminUser(Builder builder)
    {
        this.id = builder.IDno;
        this.name = builder.name;
        this.surname = builder.surname;
        this.password = builder.password;

    }


           public static class Builder {

                Long IDno;
                private String name, surname, password;

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

                public Builder passwordVal(String p) {
                    this.password = p;
                    return this;
                }


               public AdminUser build() {
                   return new AdminUser(this);
               }

           }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminUser)) return false;

        AdminUser adminUser = (AdminUser) o;

        return getId().equals(adminUser.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
