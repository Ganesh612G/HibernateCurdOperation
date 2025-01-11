package Demo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import Demo_HQL.EmployeeHQL;

public class DeleteRecord {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeHQL.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String HqlQuery = "delete from EmployeeHQL where empid=:myid";
		int myid = 2;
		Query<EmployeeHQL> query = ss.createQuery(HqlQuery);
		query.setParameter("myid", myid);
		query.executeUpdate();
		System.out.println("Data Is deleted...");
		tr.commit();
		ss.close();

	}
}