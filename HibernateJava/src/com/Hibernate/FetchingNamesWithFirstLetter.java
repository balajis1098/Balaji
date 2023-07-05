package com.Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.employee.Employee;

public class FetchingNamesWithFirstLetter 
{
	public static void main(String[] args) 
	{
		try {
			Configuration cfx = new Configuration();
		
			cfx.configure("HibernateCfg.xml");
		
			SessionFactory sf = cfx.buildSessionFactory();
		
			Session session  = sf.openSession();
		
			Query query = session.createQuery("From Employee emp where emp.ename like :eName");
		
			query.setParameter("eName", "A%");
		
			List<Employee> list = query.list();
		
			System.out.println("Employee name Starts with letter ‘A’");
		
			if(list != null)
			{
				for(int i=0; i<list.size();i++)
				{
					System.out.println(list.get(i).getEname());
				}
			}
			
		
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
