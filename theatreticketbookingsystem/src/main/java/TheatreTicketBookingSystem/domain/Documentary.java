package TheatreTicketBookingSystem.domain;

import TheatreTicketBookingSystem.domain.Intefaces.Movie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Documentary implements Movie
{
    @Id
    @GeneratedValue
    protected Long movie_id;
    protected int duration;
    protected String title;
    protected String imagePath;

    public Documentary() { }

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

    public String getImagePath() { return imagePath; }

    public Documentary(Builder builder){
        this.movie_id = builder.movie_id;
        this.duration = builder.duration;
        this.title = builder.title;
        this.imagePath = builder.imagePath;

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

        public Documentary build(){
            return  new Documentary(this);
        }
    }
}