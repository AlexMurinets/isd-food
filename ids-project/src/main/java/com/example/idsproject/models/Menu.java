package com.example.idsproject.models;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.Set;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private Provider provider;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menu")
    private Set<Item> items;

    enum option{
        S, M
    }

    private Float price;

    @Lob
    private Byte[] img;

    private DayOfWeek dayOfWeak;

    private Boolean isActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Byte[] getImg() {
        return img;
    }

    public void setImg(Byte[] img) {
        this.img = img;
    }

    public DayOfWeek getDayOfWeak() {
        return dayOfWeak;
    }

    public void setDayOfWeak(DayOfWeek dayOfWeak) {
        this.dayOfWeak = dayOfWeak;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
