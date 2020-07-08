package com.geekbrains.hibernate.h2;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user")
    List<Deal> deals;

    @ManyToMany
    @JoinTable(
            name = "purchases",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> purchases;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getPurchases() {
        return purchases;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setPurchases
            (List<Product> purchases) {
        this.purchases = purchases;
    }

    public User() {
    }

    public void print() {
        System.out.println("User id = " + id + "; name = " + name);
    }
}
