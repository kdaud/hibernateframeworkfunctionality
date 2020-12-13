package org.computer.engineering.opesourceapplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Doctor obj = new Doctor();
		obj.setEmployeeNo(200);
		obj.setName("Fred Mutamba");
		obj.setDepartment("Medicine");
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Doctor.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(obj);
		tx.commit();
		
    }
}
