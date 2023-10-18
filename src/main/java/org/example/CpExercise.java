package org.example;

import java.time.Duration;
import java.time.LocalTime;

public class CpExercise {

    public static boolean possibleTrip(int horaPart, int minPartida, int duracaoH, int duracaMin){
        if(horaPart >= 0 && minPartida >= 0 && duracaoH >= 0 && duracaMin >= 0 && minPartida <= 59 && duracaMin <= 59){
            if (horaPart > 24 ){
                return false;
            }
            if (horaPart == 24 && minPartida > 0){
                return false;
            }
            if(duracaoH == 24 && duracaMin > 0) {
                return false;
            }
            if (duracaoH == 0 && duracaMin == 0){
                return false;
            }
            return duracaoH <= 24;
        }
        return false;

    }

    public static String CpTripAnalysis(int horaPart, int minPartida, int duracaoH, int duracaMin){
        if (possibleTrip(horaPart, minPartida, duracaoH, duracaMin)){
            int horaDeChegada = 0;
            int minChegada = minPartida + duracaMin;
            if (minChegada >= 60){
                minChegada = minChegada - 60;
                horaDeChegada = 1;
            }
            horaDeChegada  = horaDeChegada + horaPart + duracaoH;

            if(horaDeChegada >= 24){
                horaDeChegada = horaDeChegada - 24;
                return "Arrival at --> " + horaDeChegada + ":" + minChegada + " of the following day";
            }
            else {
                return "Arrival at --> " + horaDeChegada + ":" + minChegada + " of the same day";
            }

        }
        return "Impossible trip.";
    }
}


