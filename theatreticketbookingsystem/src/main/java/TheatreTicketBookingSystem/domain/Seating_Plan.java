package TheatreTicketBookingSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Seating_Plan {
    @Id
    @GeneratedValue
    protected Long seat_plan_id;   //pk
    protected int seats_booked;
    protected int seats_avail;
    protected ArrayList<Integer> seats;
    protected int show_id;        //fk

    public Long getSeat_plan_id() {
        return seat_plan_id;
    }

    public int getSeats_booked() {
        return seats_booked;
    }

    public int getSeats_avail() {
        return seats_avail;
    }

    public int getShow_id() {return show_id;}

    public ArrayList<Integer> getSeats() {
        return seats;
    }
    public Seating_Plan()
    {

    }
    public Seating_Plan(Builder builder){
        this.seat_plan_id = builder.seat_plan_id;
        this.seats_booked = builder.seats_booked;
        this.seats_avail = builder.seats_avail;
        this.seats = builder.seats;
        this.show_id = builder.show_id;
    }

    public static class Builder{
        private Long seat_plan_id;   //pk
        private int seats_booked;
        private int seats_avail;
        private ArrayList<Integer> seats;
        private int show_id;        //fk


        public Builder seat_plan_id(Long seat_plan_id) {
            this.seat_plan_id = seat_plan_id;
            return this;
        }
        public Builder seats_booked(int seats_booked) {
            this.seats_booked = seats_booked;
            return this;
        }

        public Builder seats_avail(int seats_avail) {
            this.seats_avail = seats_avail;
            return this;
        }

        public Builder seats(ArrayList seats) {
            this.seats = seats;
            return this;
        }

        public Builder show_id(int value)
        {
            this.show_id = value;
            return this;
        }


        public Seating_Plan build(){
            return  new Seating_Plan(this);
        }
    }
}
