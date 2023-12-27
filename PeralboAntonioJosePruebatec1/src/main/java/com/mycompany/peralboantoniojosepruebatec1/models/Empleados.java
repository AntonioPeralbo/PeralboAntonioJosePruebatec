
package com.mycompany.peralboantoniojosepruebatec1.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleados implements Serializable {
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastName;
    private String position;
    private double salary;
    private Date startDate;

    public Empleados() {
    }

    public Empleados(String name, String lastName, String position, double salary, Date startDate) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.startDate = startDate;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Empleados{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", position=" + position + ", salary=" + salary + ", startDate=" + startDate + '}';
    }
    
    
    
    
    
}
