package wp.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	private int eno;
	private String ename;
	private int sal;
	
	@OneToOne//(fetch=FetchType.LAZY)
	private Laptop laptop;
	
	
	@OneToMany(mappedBy = "emp")
	private List<Vehical> vehicle= new ArrayList<Vehical>();
	
	@ManyToMany
	private List<Project> pro = new ArrayList<Project>();

	public Emp(int eno, String ename, int sal, Laptop laptop, List<Vehical> vehicle, List<Project> pro) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
		this.vehicle = vehicle;
		this.pro = pro;
	}
	public List<Project> getPro() {
		return pro;
	}
	public void setPro(List<Project> pro) {
		this.pro = pro;
	}
	public Emp(int eno, String ename, int sal, Laptop laptop, List<Vehical> vehicle) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
		this.vehicle = vehicle;
	}
	public List<Vehical> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<Vehical> vehicle) {
		this.vehicle = vehicle;
	}
	public Emp(int eno, String ename, int sal, Laptop laptop) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp(int eno, String ename, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	public Emp() {
		super();
	}
	
	public Emp(int eno) {
		super();
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", laptop=" + laptop + ", vehicle=" + vehicle
				+ ", pro=" + pro + "]";
	}
		
	

}
