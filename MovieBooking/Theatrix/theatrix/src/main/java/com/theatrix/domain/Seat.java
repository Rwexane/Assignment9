package com.theatrix.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Seat implements Serializable
{

    public Seat(Long id) {
        this.seat_Class_ID = id;
    }

    public Seat() {
    }

    @Id
    ///@GeneratedValue(strategy = GenerationType.AUTO)
    private Long seat_Class_ID;
    private String seat_class_category;
    private int seat_quantity;

    //***************************************Setters*******************************************

    public void setSeat_Class_ID(Long seat_Class_ID) {
        this.seat_Class_ID = seat_Class_ID;
    }

    public void setSeat_class_category(String seat_class_category) {
        this.seat_class_category = seat_class_category;
    }

    public void setClass_no_seat(int seat_quantity) {
        this.seat_quantity = seat_quantity;
    }


    //***************************************Getters*******************************************


    public Long getSeat_Class_ID() {
        return seat_Class_ID;
    }

    public String getSeat_class_category() {
        return seat_class_category;
    }

    public int getClass_no_seat() {
        return seat_quantity;
    }

    private Seat(Builder builder)
    {
        this.seat_Class_ID = builder.seat_Class_ID;
        this.seat_class_category = builder.seat_class_category;
        this.seat_quantity = builder.seat_quantity;

    }


    public static class Builder {

        private Long seat_Class_ID;
        private String seat_class_category;
        private int seat_quantity;

        public Builder seat_Class_ID(Long val) {
            this.seat_Class_ID = val;
            return this;
        }

        public Builder seat_class_category(String val) {
            this.seat_class_category = val;
            return this;
        }

        public Builder seat_quantity(int val) {
            this.seat_quantity = val;
            return this;
        }

        public Seat build() {
            return new Seat(this);
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat)) return false;

        Seat seat = (Seat) o;

        return getSeat_Class_ID().equals(seat.getSeat_Class_ID());
    }

    @Override
    public int hashCode() {
        return getSeat_Class_ID().hashCode();
    }
}
