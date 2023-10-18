package org.example;

public class GardeningRent {

    public static double rentingMaterialGarden(String typeKit, String dayWeek, double distanceKm){
        if(distanceKm < 0){
           return -2;
        }

        double price = 0;
        switch (dayWeek.toLowerCase()){
            case "segunda": case "terca" : case "quarta":
            case "quinta" : case "sexta" :{
                if(typeKit.equalsIgnoreCase("A")){
                    return  30 + distanceKm*2;
                }
                if(typeKit.equalsIgnoreCase("B")){
                    return  50 + distanceKm*2;
                }

                if(typeKit.equalsIgnoreCase("C")){
                    return  100 + distanceKm*2;
                }
                else {
                    return  -3;
                }
            }
            case "sabado" : case "domingo" : case "feriado" :{
                if(typeKit.equalsIgnoreCase("A")){
                    return  40 + distanceKm*2;
                }
                if(typeKit.equalsIgnoreCase("B")){
                    return  70 + distanceKm*2;
                }
                if(typeKit.equalsIgnoreCase("C")){
                    return  140 + distanceKm*2;
                }
                else {
                    return  -3;
                }
            }
            default:
                return -1;
        }

    }
}
