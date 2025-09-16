package org.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {
    @Id
    private  int rollNo;
    private String sName;

    public int getAsAge() {
        return asAge;
    }

    public void setAsAge(int asAge) {
        this.asAge = asAge;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    private int asAge;

    @Override
    public String toString() {
        return "Student{" +
                "asAge=" + asAge +
                ", rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                '}';
    }
}
