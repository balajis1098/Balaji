package com.Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.employee.Employee;

public class MinAndMaxSal 
{
	public static void main(String[] args) 
	{
		try {
			Configuration cfx = new Configuration();
		
			cfx.configure("HibernateCfg.xml");
		
			SessionFactory sf = cfx.buildSessionFactory();
		
			Session session = sf.openSession();
			
			//String hql = "select sal,ename from Employee sort by sal desc limit 2";
			
			String hql = "select max(sal) from Employee";
			Query query = session.createQuery(hql);
			
			/*
			 * Employee emp = new Employee();
			 * 
			 * List<Employee>al = query.list(); 
			 * al.add(emp);
			 */
			List<Employee> al = query.list();
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i).getEname());
			}
			
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
