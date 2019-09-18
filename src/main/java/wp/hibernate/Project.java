package wp.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pno;
	private String pnmae;
	
	@ManyToMany(mappedBy = "pro")
	private List<Emp> emp= new ArrayList<Emp>();
	
	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPnmae() {
		return pnmae;
	}

	public void setPnmae(String pnmae) {
		this.pnmae = pnmae;
	}

	
	
	
	public Project() {
		super();
	}

	public Project(int pno) {
		super();
		this.pno = pno;
	}

	public Project(int pno, String pnmae) {
		super();
		this.pno = pno;
		this.pnmae = pnmae;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Project [pno=" + pno + ", pnmae=" + pnmae + "]";
	}
	
	
}
