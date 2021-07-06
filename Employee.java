package com.revature.assignments.Jenkins;

public class Employee {
String name,eid;

public Employee(String name, String eid) {
	super();
	this.name = name;
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEid() {
	return eid;
}

public void setEid(String eid) {
	this.eid = eid;
}

@Override
public String toString() {
	return "EmployeeMain [name=" + name + ", eid=" + eid + "]";
}

}
