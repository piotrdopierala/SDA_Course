package main.java.pl.dopierala.OOP.company;

public enum FileType {
    TXT("txt"),XML("xml"),JSON("json");

    private String exctension;

    FileType(String extension){
        this.exctension=extension;
    }

    public String getExctension(){
        return this.exctension;
    }
}
