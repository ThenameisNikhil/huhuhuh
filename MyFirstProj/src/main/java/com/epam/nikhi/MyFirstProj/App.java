package com.epam.nikhi.MyFirstProj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Nikhil!" );
    	Employee e1=new Employee(1,"nikhil",15000);
    }
}
class Employee{
	private int id;
	private String name;
	private int salary;
	
	Employee(int id,String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	
}
class Course{
	int Cid;
	String Cname;
	int cduration;
	Course(int Cid,String Cname,int cduration){
		this.Cid=Cid;
		this.Cname=Cname;
		this.cduration=cduration;
		
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getCduration() {
		return cduration;
	}
	public void setCduration(int cduration) {
		this.cduration = cduration;
	}
}
