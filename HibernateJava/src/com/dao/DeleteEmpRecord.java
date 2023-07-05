package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.Employee;

public class DeleteEmpRecord 
{
	public static void main(String[] args) 
	{
		try {
			
			Configuration cfx = new Configuration();
			
			cfx.configure("HibernateCfg.xml");
			
			SessionFactory sf = cfx.buildSessionFactory();
			
			Session session  = sf.openSession();
			
			Transaction transaction = session.beginTransaction();
			
			Employee emp = new Employee();
			
			emp.setEmpno(10);
			
			session.delete(emp);
			
			transaction.commit();
			
			session.clear();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
