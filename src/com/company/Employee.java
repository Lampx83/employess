package com.company;

import java.time.LocalDate;

enum Gender {
    M,
    F
}

public class Employee implements Comparable<Employee> {
    private int emp_no;
    private LocalDate birth_date;
    private String first_name;
    private String last_name;
    private Gender gender;
    private LocalDate hire_date;

    public Employee() {

    }

    public Employee(int emp_no, LocalDate birth_date, String first_name, String last_name, Gender gender, LocalDate hire_date) {
        this.emp_no = emp_no;
        this.birth_date = birth_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.hire_date = hire_date;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }


    @Override
    public String toString() {
        return this.first_name + " " + this.last_name + "   " + this.birth_date;
    }


    @Override
    public int compareTo(Employee employee2) {
        return -this.last_name.compareTo(employee2.last_name);
    }

}
