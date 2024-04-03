package com.example.myfirstproject.employeeentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {

    @Id
    private int proid;
    private String proname;
    private int proprice;
    private int orderid;
    public int getProid() {
        return proid;
    }
    public void setProid(int proid) {
        this.proid = proid;
    }
    public String getProname() {
        return proname;
    }
    public void setProname(String proname) {
        this.proname = proname;
    }
    public int getProprice() {
        return proprice;
    }
    public void setProprice(int proprice) {
        this.proprice = proprice;
    }
    public int getOrderid() {
        return orderid;
    }
    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }
    public EmployeeEntity(int proid, String proname, int proprice, int orderid) {
        this.proid = proid;
        this.proname = proname;
        this.proprice = proprice;
        this.orderid = orderid;
    }
    public EmployeeEntity() {
    }
 
    
   
}