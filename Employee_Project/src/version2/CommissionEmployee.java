package version2;

import java.text.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class CommissionEmployee extends Employee{
    private double totalSales;
    
    public CommissionEmployee(){
        super();
    }
    public CommissionEmployee(String name, int id){
        super(name, id);
    }
    public CommissionEmployee(String name, int id, String dateHired, String bdate) throws ParseException{
        super(name, id, dateHired, bdate);
    }
    
    public CommissionEmployee(String name, int id, String dateHired, String bdate, double totalSales) throws ParseException{
        super(name, id, dateHired, bdate);
        this.totalSales = totalSales;
    }
    
    
    
    public void setTotalSales(double totalSales){
        this.totalSales = totalSales;
    }
    
    
    public double getTotalSales(){
        return this.totalSales;
    }
    
    public double computeSalary(){
        double salary;
        double sales = getTotalSales();
        double com;
        
        if(sales<50000){
        com = 0.05;
        }
        else if(sales>=50000&&sales<100000){
        com = 0.2;
        }
        else if(sales>=100000&&sales<500000){
        com = 0.3;
        }
        else{
        com = 0.5;
        }
    
        salary = sales*com; 
        return salary;  
    }
    
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Total sales: " + getTotalSales());
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format(super.toString()));
        s.append(String.format("\nTotal sales: " + getTotalSales()));
        s.append(String.format("\nSalary: " + computeSalary()));
        
        return s.toString();
    }
}
