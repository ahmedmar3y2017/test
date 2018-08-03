package Dao;

import Entities.customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import shared.HibernateUtil;

public class customerDao {

    static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public static customer Savecustomer(customer customer) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(customer);

        session.getTransaction().commit();

        session.close();

        return customer;
    }

}
