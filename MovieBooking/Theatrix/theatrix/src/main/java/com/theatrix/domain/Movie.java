package com.theatrix.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Movie implements Serializable
{

    public Movie(Long id) {
        this.movie_ID = id;
    }

    public Movie() {
    }

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long movie_ID;
    private String name;
    private String category;
    private String duration;
    private String yearRelease;
    private String ageRestriction;


    //***************************************Setters*******************************************


    public void setId(Long id) {
        this.movie_ID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setYearRelease(String yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setAgeRestriction(String ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    //***************************************Getters*******************************************


    public Long getId() {
        return movie_ID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDuration() {
        return duration;
    }

    public String getYearRelease() {
        return yearRelease;
    }

    public String getAgeRestriction() {
        return ageRestriction;
    }


    private Movie(Builder builder)
    {
        this.movie_ID = builder.IDno;
        this.name = builder.name;
        this.category = builder.category;
        this.duration = builder.duration;
        this.yearRelease = builder.yearRelease;
        this.ageRestriction = builder.ageRestriction;

    }


    public static class Builder {

        private Long IDno;
        private String name, category, duration, yearRelease, ageRestriction;


        public Builder idVal(Long value) {
            this.IDno = value;
            return this;
        }

        public Builder nameVal(String n) {
            this.name = n;
            return this;
        }

        public Builder categoryVal(String cat) {
            this.category = cat;
            return this;
        }


        public Builder durationVal(String dur) {
            this.duration = dur;
            return this;
        }

        public Builder yearReleaseVal(String year) {
            this.yearRelease = year;
            return this;
        }

        public Builder ageRestrictionVal(String age) {
            this.ageRestriction = age;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }




    }

}
