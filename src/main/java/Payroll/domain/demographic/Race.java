package Payroll.domain.demographic;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Race {

    private String id;
    private String description;


    //Private Constructor
    public Race(){}
    private Race(Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }

    // GETTERS AND SETTERS
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder{

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

        // New Race Object
        public Race builder(){
            return new Race(this);
        }

    }   // Builder

    @Override
    public String toString() {
        return "Race{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
