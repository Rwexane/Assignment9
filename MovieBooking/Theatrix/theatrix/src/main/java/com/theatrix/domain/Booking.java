package com.theatrix.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Booking implements Serializable
{

    public Booking(Long id) {
        this.id = id;
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long customer_ID;
    private Long movie_ID;
    private Long theatre_ID;
    private Long show_ID;
    private Long seat_ID;
    private String date;
    private int noSeats;

    @Column(name ="customer_ID", nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Customer> customerList;
    @Column(name ="movie_ID", nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Movie> movieSet;
    @Column(name ="theatre_ID", nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Theatre> theatreSet;
    @Column(name ="show_ID", nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Show> showSet;
    @Column(name ="seat_ID", nullable = false)
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Seat> seatSet;

//***************************************Setters*******************************************


    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerId(Long customerId) {
        this.customer_ID = customerId;
    }

    public void setMovieId(Long movieId) {
        this.movie_ID = movieId;
    }

    public void setTheatreId(Long theatreId) {
        this.theatre_ID = theatreId;
    }

    public void setShowId(Long showId) {
        this.show_ID = showId;
    }

    public void setSeatId(Long seatId) {
        this.seat_ID = seatId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNumCustomers(int noSeats) {
        this.noSeats = noSeats;
    }

    //***************************************Getters*******************************************


    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customer_ID;
    }

    public Long getMovieId() {
        return movie_ID;
    }

    public Long getTheatreId() {
        return theatre_ID;
    }

    public Long getShowId() {
        return show_ID;
    }

    public Long getSeatId() {
        return seat_ID;
    }

    public String getDate() {
        return date;
    }

    public int getNumCustomers() {
        return noSeats;
    }



    private Booking(Builder builder)
    {
        this.id = builder.IDno;
        this.customer_ID = builder.custId;
        this.movie_ID = builder.movieId;
        this.theatre_ID = builder.theatreId;
        this.show_ID = builder.showId;
        this.seat_ID = builder.seatId;
        this.date = builder.date;
        this.noSeats = builder.noSeats;

    }


    public static class Builder {

        private Long IDno, custId, movieId, theatreId, showId, seatId;
        private String date; int noSeats;


        public Builder id(Long id) {
            this.IDno = id;
            return this;
        }
        public Builder custIdVal(Long id) {
            this.custId = id;
            return this;
        }

        public Builder movieIdVal(Long id) {
            this.movieId = id;
            return this;
        }

        public Builder theatreIdVal(Long id) {
            this.theatreId = id;
            return this;
        }

        public Builder showIdVal(Long id) {
            this.showId = id;
            return this;
        }

        public Builder seatIdVal(Long id) {
            this.seatId = id;
            return this;
        }

        public Builder dateVal(String date) {
            this.date = date;
            return this;
        }

        public Builder numCustVal(int num) {
            this.noSeats = num;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }



    }
