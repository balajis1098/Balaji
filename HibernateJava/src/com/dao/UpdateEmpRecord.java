package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.Employee;

public class UpdateEmpRecord 
{
	public static void main(String[] args) 
	{
		try {
			Configuration cfx = new Configuration();
		
			cfx.configure("HibernateCfg.xml");
		
			SessionFactory sf = cfx.buildSessionFactory();
		
			Session session = sf.openSession();
		
			Transaction tnx = session.beginTransaction();
		
			Employee employee = new Employee();
		
			employee.setEmpno(13);
			employee.setEname("Michael");
			employee.setSal(5000);
			employee.setJob("ItI");
			employee.setDeptno(5);
		
			session.update(employee);
		
			tnx.commit();
			session.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
	}
}
