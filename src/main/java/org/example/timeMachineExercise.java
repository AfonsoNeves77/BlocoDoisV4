package org.example;

public class timeMachineExercise {

    public static boolean possibleTiming(int horaInicio, int minInicio, int segundosInicio, int duracaoS){
        if(horaInicio >= 0 && minInicio >= 0 && segundosInicio >= 0 && duracaoS > 0){
            if (minInicio <= 59 && segundosInicio <= 59 && horaInicio <= 24){
                if(horaInicio == 24){
                    return  segundosInicio == 0 && minInicio == 0;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static String workAnalysis(int horaInicio, int minInicio, int segundosInicio, int duracaoS){
        if (possibleTiming(horaInicio, minInicio, segundosInicio, duracaoS)){
            int horaTermino = 0;
            int minTermino = duracaoS/60;
            double s = Math.round(((double) duracaoS /60 - minTermino)*60);
            int sTermino = (int) (segundosInicio + s);

            if(sTermino >= 60){
                sTermino = sTermino - 60;
                minTermino = minTermino + 1;
            }
            minTermino = minInicio + minTermino;
            if(minTermino >= 60){
                minTermino = minTermino - 60;
                horaTermino = horaTermino + 1;
            }

            horaTermino = horaTermino + horaInicio;

            if(horaTermino >= 24){
                horaTermino = horaTermino - 24;

            }
            return "Hora de termino do serviço: " + horaTermino + ":" + minTermino + ":" + sTermino;
        }
        return "Impossible trip.";
    }
}
