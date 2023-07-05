package com.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.employee.Employee;

public class InsertEmployee 
{
	public static void main(String[] args) 
	{
		try {
			
			Employee e = new Employee();
			//e.setEmpno(2);
			e.setEname("Pujesh");
			e.setSal(5500);
			e.setJob("Chemical Dept");
			e.setDeptno(9);
			Configuration cfg = new Configuration();
		
			cfg.configure("HibernateCfg.xml");
		
			SessionFactory sf = cfg.buildSessionFactory();
		
			Session session  = sf.openSession();
		
			Transaction tnx = session.beginTransaction();
				
			session.save(e);
			System.out.println("Data Inserted Successfully");
			tnx.commit();
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
 	}
}
