package com.Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.employee.Employee;

public class FetchingSalary 
{
	public static void main(String[] args) 
	{
		try {
			Configuration cfg = new Configuration();
		
			cfg.configure("HibernateCfg.xml");
		
			SessionFactory sf = cfg.buildSessionFactory();
		
			Session session  = sf.openSession();
		
			Query query = session.createQuery("From Employee emp WHERE emp.sal BETWEEN :old AND :new");
		
			query.setParameter("old", 5000);
			query.setParameter("new", 7000);
			
			List<Employee> list = query.list();
			
			System.out.println("EmpNo      Ename          sal       job          deptNo " );
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getEmpno()+"          "+list.get(i).getEname()+"        "+list.get(i).getSal()+"       "+list.get(i).getJob()+"  "+list.get(i).getDeptno());
			}
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}
