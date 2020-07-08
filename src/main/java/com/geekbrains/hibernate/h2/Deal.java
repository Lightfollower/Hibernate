package com.geekbrains.hibernate.h2;

import javax.persistence.*;

@Entity
@Table(name = "deals")
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "cost")
    private Integer cost;

    public Long getId() {
        return id;
    }


    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void print() {
        System.out.println("Id = " + id + "; user = " + user.getName() + "; product = " + product.getTitle() +
                "; cost = " + cost);
    }
}
