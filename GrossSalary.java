import java.util.*;
public class GrossSalary {
    public static void main(String[] args) {
        int salary , daily , houseRent , travelingA ;
        double hra;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Basic Salary ");
        salary=sc.nextInt();
        System.out.println("Enter daily Allowance ");
        daily = sc.nextInt();
        System.out.println("Enter House rent ");
        houseRent = sc.nextInt();
        System.out.println("Enter travelling allowance ");
        travelingA = sc.nextInt();
        if(salary <= 10000){
            hra= salary*0.20;
        }
        else if(salary<=20000){
            hra=salary*0.25;
        }
        else{
            hra = salary*0.30;
        }
        double gross = salary+hra+daily+houseRent+travelingA;
        System.out.println("Gross Salary is : "+gross);
    }
}
