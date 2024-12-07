package com.klef.jfsd.exam.inheritance_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        Car car = new Car();
        car.setType("Car");
        car.setMaxSpeed(200);
        car.setColor("Red");
        car.setNumberOfDoors(4);

        Truck truck = new Truck();
        truck.setType("Truck");
        truck.setPayloadCapacity(5000);

        session.persist(car);
        session.persist(truck);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
