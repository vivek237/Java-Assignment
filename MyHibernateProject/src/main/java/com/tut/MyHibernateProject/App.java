package com.tut.MyHibernateProject;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("project started.....");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		studentRecord st = new studentRecord();
		st.setId(101);
		st.setName("john");
		st.setCity("istanbul");
		System.out.println(st);

		// opening session---------------------------
		Session session = factory.openSession();

		// start transaction-------------------------
		Transaction tx = session.beginTransaction();
        
		//fetching all list
		Query q=session.createQuery("from studentRecord");
		List<studentRecord> list=q.list();
		for(studentRecord student:list) {
			System.out.println(student.getName());
		}
		
		
		// delete query------------------------------
		Query q1 = session.createQuery("delete from studentRecord as d where d.city=:c");
		q1.setParameter("c", "usa");
		int res = q1.executeUpdate();
		System.out.println(res + " Record Deleted....");

		// update query------------------------------
		 Query q2=session.createQuery("update studentRecord set city=:c where name=:n");
		 q2.setParameter("c","usa");
		 q2.setParameter("n", "jack");
		 int res2=q2.executeUpdate();
		 System.out.println(res2+" Record updated....");

		// commit transaction-------------------------
		session.save(st);
		tx.commit();
	}

}
