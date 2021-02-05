package br.com.bootcamp.Exerc15;


import java.time.LocalDateTime;

public class LocalDateUtilidade {


    public static boolean isMaior(LocalDateTime data1, LocalDateTime data2) {
        return data1.compareTo(data2) > 0;
    }

    public static boolean isIgual(LocalDateTime data1, LocalDateTime data2) {
        return data1.compareTo(data2) == 0;
    }

    public static boolean isMenor(LocalDateTime data1, LocalDateTime data2) {
        return data1.compareTo(data2) < 0;
    }

    public static boolean isMaiorOuIgual(LocalDateTime data1, LocalDateTime data2){
        return isMaior(data1, data2) || isIgual(data1 , data2);
    }

    public static boolean isMenorOuIgual(LocalDateTime data1, LocalDateTime data2){
        return isMenor(data1, data2) || isIgual(data1, data2);
    }

    public static boolean between(LocalDateTime data,
                                  LocalDateTime dataInicial,
                                  LocalDateTime dataFinal) {
        return isMaiorOuIgual(data, dataInicial) && isMenorOuIgual(data, dataFinal);
    }

}
