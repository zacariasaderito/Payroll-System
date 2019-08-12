package Payroll.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Race {

    private static String race;
    private static String black = "Black";
    private static String coloured = "Coloured";
    private static String white = "White";

    private Race(Builder builder){
        this.race = builder.race;
    }

    public String getRace() {
        return race;
    }

    public static String getBlack() {
        return black;
    }

    public static String getColoured() {
        return coloured;
    }

    public static String getWhite() {
        return white;
    }


    public static class Builder{

        private String race;

         public Builder race(String race){
             this.race = race;
             return this;
         }

         public Race build(){
         return new Race(this);
     }

         @Override
         public String toString() {
             return "Builder{" +
                    "Race='" + race + '\'' + '}';
         }
    }
}
