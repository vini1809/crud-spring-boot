package com.orusys.crudspringboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "orusys")
public class Crud {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 128, nullable = false)
    private String name;

    @Column(length = 256)
    private String description;

    @Column(nullable = false)
    private int phone;

    @Column
    private boolean published;

    public Crud() {
    }

    public Crud(String name, String description, int phone, boolean published) {
        this.name = name;
        this.description = description;
        this.phone = phone;
        this.published = published;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

}
