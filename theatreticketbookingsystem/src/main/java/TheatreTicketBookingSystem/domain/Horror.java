package TheatreTicketBookingSystem.domain;

import TheatreTicketBookingSystem.domain.Intefaces.Movie;
import javax.persistence.*;
import java.util.List;

@Entity
public class Horror implements Movie
{

    @Id
    @GeneratedValue
    public int movie_id;
    protected int duration;
    protected String title;
    protected String imagePath;

    @OneToMany(mappedBy = "id")
    protected List<Viewing> viewing;

    public Horror() {
        int i = this.movie_id;
    }

    public int getMovie_Id()
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


    public Horror(Builder builder){
        this.movie_id = builder.movie_id;
        this.duration = builder.duration;
        this.title = builder.title;
        this.imagePath = builder.imagePath;
        this.viewing = builder.viewing;
    }

    public static class Builder{

        private int movie_id;
        private String title;
        private int duration;
        private String imagePath;
        private Reservation reservation;
        private List<Viewing> viewing;

        public Builder viewing(List<Viewing> viewing) {
            this.viewing = viewing;
            return this;
        }

        public Builder reservation(Reservation reservation) {
            this.reservation = reservation;
            return this;
        }

        public Builder movie_id(int movie_id) {
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

        public Horror build(){
            return  new Horror(this);
        }
    }
}
