package com.Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.employee.Employee;

public class FetchSal 
{
	
	public static List<Employee> employessWithSameSal(int sal) {
		
		List<Employee> list = null;
		
		try {
			Configuration cfg = new Configuration();
			
			cfg.configure("HibernateCfg.xml");
			
			SessionFactory sf = cfg.buildSessionFactory();
			
			Session session  = sf.openSession();
			
			Query query = session.createQuery("from Employee e where e.sal = :salary");
			
			query.setParameter("salary", sal);
			
			list = query.list();
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).getEmpno()+"  "+list.get(i).getEname()+"  "+list.get(i).getSal()+"  "+list.get(i).getJob()+"  "+list.get(i).getDeptno());
			}
			
			session.close();
		}
		
		catch(Exception ex)
		{
			
		}
		
		return list;
	}
	public static void main(String[] args) 
	{
		
		int sal = 5000;
		List<Employee> empList = employessWithSameSal(sal);
		
		Employee emp = new Employee();
		empList.add(emp);
		
		System.out.println(emp.getDeptno());
		
		
		
		
		
	}

}
