package ru.easyjava.data.hibernate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@SuppressWarnings("PMD")
public class Passport {
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String series;

    @Getter
    @Setter
    private String no;

    @Getter
    @Setter
    private Date issueDate;

    @Getter
    @Setter
    private Person owner;

    @Override
    public String toString() {
        return "Passport{" +
                "series='" + series + '\'' +
                ", no='" + no + '\'' +
                ", issueDate=" + issueDate +
                ", owner=" + owner.getLastName() +
                '}';
    }
}
