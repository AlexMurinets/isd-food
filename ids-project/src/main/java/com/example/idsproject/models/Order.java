package com.example.idsproject.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @OneToMany
    private Set<Menu> menus;

    @OneToOne
    private Provider provider;

    private Date orderDate;

    private Boolean isComplete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
