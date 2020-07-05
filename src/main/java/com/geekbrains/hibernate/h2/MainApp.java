package com.geekbrains.hibernate.h2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            List<Product> allProducts = session.createQuery("SELECT p FROM Product p").getResultList();
            User u = session.get(User.class, 2L);

            allProducts.stream().forEach(p -> {
                if(p.getId() > 1 && p.getId() < 4) {
                    u.getPurchases().add(p);
                }
            });
            List<Product> products = session.createQuery("select p from Product p, User u where u.id = 2 ").getResultList();
            for (Product p :
                    products) {
                p.print();
            }

//            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
            if (session != null) {
                session.close();
            }
        }
    }
}
