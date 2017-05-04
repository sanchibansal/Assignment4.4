import java.util.*;
class Employee{
    public double basic;
    double pfa,hra,total_salary;
    String name;
    void salary_cal(double basic, String name){
        this.name= name;
	this.basic= basic;			
        pfa = .12*basic;
	hra = .5 *basic;	
	total_salary = basic + (.5 *basic)-(.12*basic);			//calculates the salary of the employee
	System.out.println("total salary of "+name+" is= "+total_salary);
    }
 }
class Manager extends Employee{			// class manager extends employee
    void travel_allowance(){
	double travel_allowance= .15*basic;				//calculates the travel allowance of the Manager
	System.out.println("travel allowance of "+name+" is= " +travel_allowance);
    }
 }
class Trainee extends Employee{			// class trainee extends employee
    void travel_allowance(){
	double travel_allowance = .10*basic;			//calculates the travel allowance of the Trainee
	System.out.println("travel allowance of "+name+" is= " +travel_allowance);
    }
}
class Employee_sal{
    public static void main(String args[]){
    Scanner g= new Scanner(System.in);
    System.out.println("enter name of the employee");
    String name= g.next();
    System.out.println("enter type of employee: \npress 1 for manager \npress 2 for trainee: ");
    int a=g.nextInt();
    switch(a){
	 case 1:{
	    Manager m= new Manager();
	    m.salary_cal(12000,name);		//calls salary_cal of the super class employee
	    m.travel_allowance();			//calls travel allowance method in manager class
	    break;
         }
	 case 2:{
	    Trainee t= new Trainee();
	    t.salary_cal(10000,name);		//calls salary_cal of the super class employee
	    t.travel_allowance();			// calls travel allowance method in the trainee class 
	    break;
	 }
    }
    }
}
 