package wp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DetailsEntry {
	
private static SessionFactory sf=Util.getSF();
	

	public void insertProjects(Project project)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(project);
		tr.commit();
		session.close();
		
		System.out.println("Project Stored Successfully");
	}
	
	public void insertEmployees(Emp emp)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
		
		System.out.println("Employee Stored Successfully");
	}
	
	public void insertLaptops(Laptop laptop)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(laptop);
		tr.commit();
		session.close();
		System.out.println("Laptop Stored Successfully");
	}
	
	public void insertVehicles(Vehical vehicle)
	{
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(vehicle);
		tr.commit();
		session.close();
		
		System.out.println("VEHICLES Stored Successfully");
	}
		public static void main(String[] args) {
			DetailsEntry de= new DetailsEntry();
			
			//Employee Entry
			Emp e1=new Emp(1001,"AAA",100000,new Laptop("L111"));
			e1.getPro().add(new Project(111));
			e1.getPro().add(new Project(112));
			e1.getPro().add(new Project(113));
			
			Emp e2=new Emp(1002,"BBB",150000,new Laptop("L112"));
			e2.getPro().add(new Project(113));
			e2.getPro().add(new Project(114));
			e2.getPro().add(new Project(115));
			
			
			Emp e3=new Emp(1003,"CCC",200000,new Laptop("L113"));
			e3.getPro().add(new Project(111));
			e3.getPro().add(new Project(114));
			e3.getPro().add(new Project(115));
			
			
		
		/*
		 * de.insertEmployees(e1); de.insertEmployees(e2); de.insertEmployees(e3);
		 */ 
		 
			
			
			//Laptop Entry
			Laptop l1 = new Laptop("L111", "DELL", 50000);
			Laptop l2 = new Laptop("L112", "HCL", 70000);
			Laptop l3 = new Laptop("L113", "HP", 40000);
		
		/* de.insertLaptops(l1); de.insertLaptops(l2); de.insertLaptops(l3); */ 
		 
			//Vehicle Entry
			Vehical v1= new Vehical(1, "AUDI", "Q3", 500000,new Emp(1001));
			Vehical v2= new Vehical(2, "BMW", "X7", 600000,new Emp(1001));
			Vehical v3= new Vehical(3, "AUDI", "Q3", 500000,new Emp(1002));
			Vehical v4= new Vehical(4, "BMW", "X7", 600000,new Emp(1002));
			Vehical v5= new Vehical(5, "AUDI", "Q3", 500000,new Emp(1002));
			Vehical v6= new Vehical(6, "BMW", "X7", 600000,new Emp(1003));
			Vehical v7= new Vehical(7, "AUDI", "Q3", 500000,new Emp(1003));
			
			de.insertVehicles(v1);
			de.insertVehicles(v2);
			de.insertVehicles(v3);
			de.insertVehicles(v4);
			de.insertVehicles(v5);
			de.insertVehicles(v6);
			de.insertVehicles(v7);
			
			//Project
			Project p1=new Project(111, "AcSw");
			Project p2=new Project(112,"ERP");
			Project p3=new Project(113,"BnkSw");
			Project p4=new Project(114,"SecApp");
			Project p5=new Project(115,"ECommerce");
		
		
		
		/*
		 * de.insertProjects(p1); de.insertProjects(p2); de.insertProjects(p3);
		 * de.insertProjects(p4); de.insertProjects(p5);
		 */
		 
		}
	}

