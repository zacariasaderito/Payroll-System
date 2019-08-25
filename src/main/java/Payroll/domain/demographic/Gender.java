package Payroll.domain.demographic;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Gender {

    private String id;
    private String description = "";

    //Private Constructors
    private Gender(){}
    private Gender (Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {

        String id;
        String description;

        public Builder getId(String id){
            this.id = id;
            return this;
        }

        public Builder getDescription(String description){
            this.description = description;
            return this;
        }

        public Gender builder(){
            return new Gender(this);
        }

    } // Builder

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
