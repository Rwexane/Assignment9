package TheatreTicketBookingSystem.domain;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Reservation {
    @Id
    @GeneratedValue
    protected Long reservation_id;      //pk
    //private ArrayList<Integer> seats;
    protected int total_price;


//    @ManyToOne(optional=false)
//    private Viewing show;            //fk
    @ManyToOne(optional=false)
    protected Customer customer;        //fk

    @ManyToOne(optional=false)
    public Viewing viewing;

    public Long getReservation_id() {
        return reservation_id;
    }

   // public ArrayList<Integer> getSeats() {
//        return seats;
//    }

    public int getTotal_price() {
        return total_price;
    }

//    public Viewing getShow() {
//        return show;
//    }

    public Customer getCustomer() {return customer;}
    public Reservation() {}

    public Reservation(Builder builder){
        this.reservation_id = builder.reservation_id;
       // this.seats = builder.seats;
        this.total_price = builder.total_price;
       // this.show = builder.show;
        this.customer = builder.customer_id;
    }

    public static class Builder{
        private Long reservation_id;      //pk
        private ArrayList<Integer> seats;
        private int total_price;
        private Viewing show;            //fk
        private Customer customer_id;        //fk


        public Builder reservation_id(Long reservation_id) {
            this.reservation_id = reservation_id;
            return this;
        }

        public Builder seats(ArrayList<Integer> seats) {
            this.seats = seats;
            return this;
        }

        public Builder total_price(int total_price) {
            this.total_price = total_price;
            return this;
        }

        public Builder show_id(Viewing show_id) {
            this.show = show_id;
            return this;
        }

        public Builder customer_id(Customer value)
        {
            this.customer_id = value;
            return this;
        }

        public Reservation build(){
            return  new Reservation(this);
        }
    }
}
