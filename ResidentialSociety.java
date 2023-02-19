import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
class ResidentialSociety {
    String societyName;
    String location;
    String secretaryName;
    
    public ResidentialSociety(String societyName, String location, String secretaryName) {
        this.societyName = societyName;
        this.location = location;
        this.secretaryName = secretaryName;
    }
    
    public void viewSocietyDetails() {
        System.out.println("Society Name: " + societyName);
        System.out.println("Location: " + location);
        System.out.println("Secretary Name: " + secretaryName);
    }
}

class Building extends ResidentialSociety {
    String buildingName;
    int totalNumberOfApartments;
    List<Apartment > apartments=new ArrayList<>();  
    
    public Building(String societyName, String location, String secretaryName, String buildingName, int totalNumberOfApartments) {
        super(societyName, location, secretaryName);
        this.buildingName = buildingName;
        this.totalNumberOfApartments = totalNumberOfApartments;
        
    }
    
    public void viewBuildingDetails() {
        System.out.println("Building Name: " + buildingName);
        System.out.println("Number of Apartments: " + totalNumberOfApartments);
    }
    
    public void viewApartmentDetails() {
        System.out.println("Apartment Details:");
        for (int i = 0; i <apartments.size(); i++) {
            System.out.println("Apartment " + (i + 1) + ":");
            apartments.get(i).viewApartmentDetails();
          
        }
    }
}

class Apartment extends Building {
    int apartmentNumber;
    String ownerName;
    String electricMeterNumber;
    
    public Apartment(String societyName, String location, String secretaryName, String buildingName, int totalNumberOfApartments, int apartmentNumber, String ownerName, String electricMeterNumber) {
        super(societyName, location, secretaryName, buildingName, totalNumberOfApartments);
        this.apartmentNumber = apartmentNumber;
        this.ownerName = ownerName;
        this.electricMeterNumber = electricMeterNumber;
    }
    
    public void viewApartmentDetails() {
        System.out.println("Apartment Number: " + apartmentNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Electric Meter Number: " + electricMeterNumber);
    }
}