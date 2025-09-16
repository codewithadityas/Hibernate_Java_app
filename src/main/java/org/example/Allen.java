package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Allen {
    @Id
    private int add;
    private String aname;
    private String tech;
    private Laptop laptop;

    public int getAdd() {
        return add;
    }

    public String getAname() {
        return aname;
    }
    public  Laptop getLaptop(){
        return laptop;
    }
    public  void setLaptop(Laptop laptop){
         this.laptop=laptop;
    }

    @Override
    public String toString() {
        return "Allen{" +
                "add=" + add +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public void setAdd(int add) {
        this.add = add;
    }
}
