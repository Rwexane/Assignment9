package TheatreTicketBookingSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Action
{
    @Id
    @GeneratedValue
    protected Long id;
    protected int duration;
    protected String title;
    protected String imagePath;
    @OneToMany()
    protected List<Viewing> viewing;

    public String getImagePath() { return imagePath; }

    public Long getId()
    {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public Action() { }

    public Action(Builder builder){
        this.id = builder.id;
        this.duration = builder.duration;
        this.title = builder.title;
        this.imagePath = builder.imagePath;
        this.viewing = builder.viewing;
    }

    public static class Builder{

        private Long id;
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

        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Builder movie_id(Long movie_id) {
            this.id = movie_id;
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

        public Action build(){
            return  new Action(this);
        }
    }
}
