package TheatreTicketBookingSystem.domain;

import TheatreTicketBookingSystem.domain.Intefaces.Movie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class SciFi implements Movie
{
    @Id
    @GeneratedValue
    protected Long movie_id;
    protected int duration;
    protected String title;
    protected String imagePath;
//    @OneToOne
//    private Reservation reservation;

//    public Reservation getReservation() {
//        return reservation;
//    }

    public SciFi() { }

    public Long getMovie_Id()
    {
        return movie_id;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getImagePath() {
        return imagePath;
    }


    public SciFi(Builder builder){
        this.movie_id = builder.movie_id;
        this.duration = builder.duration;
        this.title = builder.title;
        this.imagePath = builder.imagePath;
 //       this.reservation = builder.reservation;
    }

    public static class Builder{

        private Long movie_id;
        private String title;
        private int duration;
        private String imagePath;
        private Reservation reservation;

        public Builder reservation(Reservation reservation) {
            this.reservation = reservation;
            return this;
        }


        public Builder movie_id(Long movie_id) {
            this.movie_id = movie_id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public SciFi build(){
            return  new SciFi(this);
        }
    }
}