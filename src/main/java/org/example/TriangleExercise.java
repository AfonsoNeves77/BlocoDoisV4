package org.example;

public class TriangleExercise {

    public static boolean isTrianglePossible(double sideA, double sideB, double sideC){
        if (sideA > 0 && sideB > 0 && sideC > 0){
                return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
        }
        return false;
    }

    public static String typeofTriangle(double sideA, double sideB, double sideC){
        if(isTrianglePossible(sideA,sideB,sideC)){
            if (sideA == sideB && sideB == sideC && sideA == sideC){
                return "Equilateral";
            }
            else{
                if(sideA == sideB || sideB == sideC || sideC == sideA){
                    return "Isosceles";
                }
                return "Scalene";
            }
        }
        return "Impossible triangle";
    }

    public static boolean isTrianglePossibleAngle(double angleA, double angleB, double angleC){
        return angleA > 0 && angleB > 0 && angleC > 0 && angleA + angleB + angleC == 180.0;

    }

    public static String typeofTriangleAngle(double angleA, double angleB, double angleC){
        if(isTrianglePossibleAngle(angleA,angleB,angleC)){
            if (angleA == 90 || angleB == 90 || angleC == 90) {
                return "Triangulo reto";
            }
            if (angleA > 90 || angleB > 90 || angleC > 90){
                return "Triangulo obtuso";
            }
            else {
                return "Acutangulo";
            }
        }
        return "Triangulo impossivel.";

    }

}
