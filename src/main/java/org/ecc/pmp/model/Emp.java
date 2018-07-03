package org.ecc.pmp.model;
// Generated Jan 3, 2018 1:14:58 AM by Hibernate Tools 5.2.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Emp generated by hbm2java
 */
@Entity
@Table(name = "EMP")
public class Emp implements java.io.Serializable {

	private long empno;
	private Dept dept;
	private Emp emp;
	private Long comm;
	private String ename;
	private Date hiredate;
	private String job;
	private Long sal;
	private Set<Emp> emps = new HashSet<Emp>(0);

	public Emp() {
	}

	public Emp(long empno) {
		this.empno = empno;
	}

	public Emp(long empno, Dept dept, Emp emp, Long comm, String ename, Date hiredate, String job, Long sal,
			Set<Emp> emps) {
		this.empno = empno;
		this.dept = dept;
		this.emp = emp;
		this.comm = comm;
		this.ename = ename;
		this.hiredate = hiredate;
		this.job = job;
		this.sal = sal;
		this.emps = emps;
	}

	@Id

	@Column(name = "EMPNO", unique = true, nullable = false, precision = 10, scale = 0)
	public long getEmpno() {
		return this.empno;
	}

	public void setEmpno(long empno) {
		this.empno = empno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEPT")
	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MGR")
	public Emp getEmp() {
		return this.emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Column(name = "COMM", precision = 10, scale = 0)
	public Long getComm() {
		return this.comm;
	}

	public void setComm(Long comm) {
		this.comm = comm;
	}

	@Column(name = "ENAME", length = 160)
	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "HIREDATE", length = 7)
	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	@Column(name = "JOB", length = 144)
	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Column(name = "SAL", precision = 10, scale = 0)
	public Long getSal() {
		return this.sal;
	}

	public void setSal(Long sal) {
		this.sal = sal;
	}

	/*@OneToMany(fetch = FetchType.EAGER, mappedBy = "emp")
	public Set<Emp> getEmps() {
		return this.emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}*/

}
