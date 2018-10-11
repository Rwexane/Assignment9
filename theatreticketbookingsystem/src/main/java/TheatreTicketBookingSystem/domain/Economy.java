package TheatreTicketBookingSystem.domain;

import TheatreTicketBookingSystem.domain.Intefaces.Seating_Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Economy implements Seating_Class {

    @Id
    @GeneratedValue
    protected Long seat_id;
    protected String class_name;
    protected int price;
    protected String imagePath;

    public Economy() { }

    public String getClass_name() {
        return class_name;
    }

    public int getPrice() {
        return price;
    }

    public Long getSeat_id() {
        return seat_id;
    }

    public String getImagePath() { return imagePath; }

    public Economy(Builder builder){
        this.class_name = builder.class_name;
        this.price = builder.price;
        this.seat_id = builder.seat_id;
        this.imagePath = builder.imagePath;
    }

    public static class Builder{
        private String class_name;
        private int price;
        private Long seat_id;
        private String imagePath;


        public Builder class_name(String class_name) {
            this.class_name = class_name;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder seat_id(Long seat_id) {
            this.seat_id = seat_id;
            return this;
        }

        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Economy build(){
            return new Economy(this);
        }
    }
}
