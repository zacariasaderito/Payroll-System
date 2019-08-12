package Payroll.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Gender {

    private String gender;
    private static String female = "Female";
    private static String male = "Male";

    public String getGender() {
        return gender;
    }

    public static String getFemale() {
        return female;
    }

    public static String getMale() {
        return male;
    }

    private Gender(Builder builder){
        this.gender = builder.gender;
    }
    public static class Builder{


        private String gender;

        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public  Gender build(){
            return new Gender(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "Gender='" + gender + '\'' +
                    '}';
        }
    }
}
