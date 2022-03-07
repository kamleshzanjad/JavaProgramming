package session5;

import jdk.nashorn.internal.objects.annotations.Setter;

class Employee1{
    float salary=40000;

    // Menu Code>Generate > Getter And Setter
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}

class Programmer1 extends Employee1{
    int bonus=10000;

    // Menu Code>Generate > Getter And Setter for bonus
}

public class _1_InheritanceAndGetterSetter {

    public static void main(String args[]){
        Programmer1 p=new Programmer1();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);

        System.out.println("Programmer salary is:"+p.getSalary());
    }

}


