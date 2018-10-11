package TheatreTicketBookingSystem.domain;

import com.google.gson.Gson;
import org.springframework.boot.json.GsonJsonParser;

import javax.json.Json;
import javax.persistence.*;
import java.util.List;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue
    protected Long customer_id;
    protected String name;
    protected String surname;
    protected String email;
    protected String cell;
    protected String password;




//    @OneToMany(mappedBy = "reservation_id")
//    private List<Reservation> reservation;

    public String getPassword() {
        return password;
    }
//    public List<Reservation> getReservation() {
//        return reservation;
//    }
    public Long getCustomer_id() {
        return customer_id;
    }

    public String getName() { return name; }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getCell() {
        return cell;
    }

    public Customer() {

//        Gson json = new Gson();
//        GsonJsonParser.class.cast(this);
//        Long i = this.customer_id;
    }

    public Customer(Builder builder){
        this.customer_id = builder.customer_id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.cell = builder.cell;
       // this.password = builder.password;
       // this.reservation = builder.reservation;
    }

    public static class Builder{
        private Long customer_id;            //pk
        private String name;
        private String surname;
        private String email;
        private String cell;
       // private String password;
        private List<Reservation> reservation;

        public Builder reservation(List<Reservation> reservation) {
            this.reservation = reservation;
            return this;
        }

        public Builder customer_id(Long customer_id) {
            this.customer_id = customer_id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder cell(String cell) {
            this.cell = cell;
            return this;
        }

//        public Builder password(String password) {
//            this.password = password;
//            return this;
//        }

        public Customer build(){
            return  new Customer(this);
        }
    }

}
