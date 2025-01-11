package Demo.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Demo_HQL.EmployeeHQL;

public class InsertRecord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter data do You Want to insert");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeHQL.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		System.out.println("enter name");
		String Name=sc.next();
		System.out.println("enter department");
		String Deparment=sc.next();
		System.out.println("enter salary");
		int salary=sc.nextInt();

		String HqlQuery="insert into EmployeeHQL(Name,Deparment,salary)values(:myName,:myDeparment,:mysalary)";
	     Query<EmployeeHQL> query=ss.createQuery(HqlQuery);
	     query.setParameter("myName",Name);
	     query.setParameter("myDeparment", Deparment);
	     query.setParameter("mysalary", salary);
	     
	     query.executeUpdate();
	     System.out.println("Data Is Inserted..");
	     tr.commit();
	     ss.close();
	     
		}
	}
