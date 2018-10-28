package com.theatrix.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Theatre implements Serializable
{
    public Theatre(Long id) {
        this.theatre_ID = id;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long theatre_ID;
    private String name;
    private String address;
    private String maxAdience;
    private String minAdience;
    private Long show_ID;

    @Column(name ="show_ID", nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Show> showSet;

    //***************************************Setters*******************************************

    public void setId(Long id) {
        this.theatre_ID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMaxAdience(String maxAdience) {
        this.maxAdience = maxAdience;
    }

    public void setMinAdience(String minAdience) {
        this.minAdience = minAdience;
    }

    public void setShowId(Long show_ID) {
        this.show_ID = show_ID;
    }


    //***************************************Getters*******************************************


    public Long getId() {
        return theatre_ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMaxAdience() {
        return maxAdience;
    }

    public String getMinAdience() {
        return minAdience;
    }

    public Long getShowId() {
        return show_ID;
    }

    private Theatre(Builder builder)
    {
        this.theatre_ID = builder.IDno;
        this.name = builder.name;
        this.address = builder.address;
        this.maxAdience = builder.maxAdience;
        this.minAdience = builder.minAdience;
        this.show_ID = builder.showId;

    }


    public static class Builder {

        Long IDno, showId;
        private String name, address, maxAdience, minAdience;

        public Builder id(Long n) {
            this.IDno = n;
            return this;
        }

        public Builder nameVal(String n) {
            this.name = n;
            return this;
        }

        public Builder addressVal(String val) {
            this.address = val;
            return this;
        }


        public Builder maxAdienceVal(String val) {
            this.maxAdience = val;
            return this;
        }

        public Builder minAdienceVal(String val) {
            this.minAdience = val;
            return this;
        }

        public Builder showIdVal(Long val) {
            this.showId = val;
            return this;
        }

        public Theatre build() {
            return new Theatre(this);
        }


    }


}
