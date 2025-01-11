package Demo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Demo_HQL.EmployeeHQL;

public class GetSingleRecord {
	
public static void main(String[] args) {
		
	 Configuration cfg = new Configuration();
     cfg.configure("hibernate.cfg.xml");
     cfg.addAnnotatedClass(EmployeeHQL.class);
     SessionFactory sf = cfg.buildSessionFactory();
     Session ss = sf.openSession();
     Transaction tr = ss.beginTransaction();
     
     String HqlQuery="from EmployeeHQL where empid=:emp";
     Query<EmployeeHQL> query=ss.createQuery(HqlQuery,EmployeeHQL.class);
     query.setParameter("emp", 1);
     EmployeeHQL  e=(EmployeeHQL) query.getSingleResult();
     System.out.println(e);
     
	}
}
