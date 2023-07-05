package com.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.employee.Employee;

public class FetchEmpRecords 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("HibernateCfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Query query = session.createQuery("from Employee");
		
		List<Employee> list = query.list();
		System.out.println("empno      ename          sal          job         deptno");
		if(list.size()>0)
		{
			for(int i=0; i<list.size();i++)
			{
				System.out.println(list.get(i).getEmpno()+"         "+list.get(i).getEname()+"          "+list.get(i).getSal()+"          "+list.get(i).getJob()+"          "+list.get(i).getDeptno());
			}
		}
		else
		{
			System.out.println("Empty Data");
		}
	}
}
