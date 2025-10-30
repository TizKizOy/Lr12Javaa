package org.shabCompany;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee() {empId=0; name="underfind"; ssn="underfind"; salary=0.0;}
    public Employee(int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int value){
        if(value > 0)
            empId = value;
    }

    public String getName(){
        return name;
    }
    public void setName(String value){
        if (!value.isEmpty())
            name = value;
    }

    public String getSsn(){
        return ssn;
    }
    public void setSsn(String value){
        if (!value.isEmpty())
            ssn = value;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double value){
        if (value>0.0)
            salary = value;
    }
}
