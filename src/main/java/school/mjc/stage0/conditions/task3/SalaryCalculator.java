package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxes;
        double salareis;
        if ( salary > 0 && salary <= 10000){
            taxes = 0.15;
            salareis = salary - salary * taxes;
            System.out.println(salareis);
        } else if (salary > 10000 && salary <= 20000) {
            taxes = 0.18;
            salareis = salary - salary * taxes;
            System.out.println(salareis);
        } else if (salary > 20000) {
            taxes = 0.20;
            salareis = salary - salary * taxes;
            System.out.println(salareis);
        }else if(salary < 0){
            System.out.println("wrong input!");
        }
    }
}
