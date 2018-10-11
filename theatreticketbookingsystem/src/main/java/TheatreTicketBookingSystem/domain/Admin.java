package TheatreTicketBookingSystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    protected Long admin_id;       //pk
    protected String name;
    protected String surname;
    protected String email;

    public Long getAdmin_id() {
        return admin_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
    public Admin() {}
    public Admin(Builder builder){
        this.admin_id = builder.admin_id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
    }

    public static class Builder{
        private Long admin_id;       //pk
        private String name;
        private String surname;
        private String email;

        public Builder admin_id(Long admin_id) {
            this.admin_id = admin_id;
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

        public Admin build(){
            return  new Admin(this);
        }
    }
}
