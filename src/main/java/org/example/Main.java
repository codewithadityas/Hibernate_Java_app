package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

 Laptop laptop1=new Laptop();
        laptop1.setBrand("mac");
        laptop1.setModel("new");
         laptop1.setRam(2);


//        Create Alien class
        Allen a1= new Allen();
        a1.setTech("MCA");
        a1.setAdd(200);
        a1.setAname("Aditya");
        a1.setLaptop(laptop1);
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Allen.class);
        cfg.configure();
        // Build session factory
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(a1);
        tx.commit();
        session.close();
        sf.close();





        // Create a student object
        /*  Student s1 = new Student();
        s1.setsName("Record12");
        s1.setAsAge(13);
        s1.setRollNo(5);

        // Load configuration and add annotated class
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();


        // Build session factory
        SessionFactory sf = cfg.buildSessionFactory();

        // Open session and begin transaction
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // Save the student object
        session.persist(s1);

        // Commit and close
        tx.commit();
        session.close();
        sf.close();

        System.out.println("Student saved: " + s1);*/



    }
}
