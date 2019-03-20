package com.test.company.quadratic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Quadratic")
public class Quadratic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float a;
    private float b;
    private float c;
    private double x1, x2, d;

    public Quadratic() {
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

}
