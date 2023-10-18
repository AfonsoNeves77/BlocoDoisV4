package org.example;

public class employeeSalary {

    public static double employSalaryCalc(int horas){
        if(horas >= 36){
            if (horas == 36){
                return 270;
            }
            if (horas <= 41){
                return (horas - 36)*10 + 270;
            }
            return (horas - 41) * 15 + 320;
        }
        else {
            return -1;
        }
    }
}
