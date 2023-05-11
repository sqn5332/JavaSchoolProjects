/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignment3;

/**
 *
 * @author sebas
 */
public class Address {
    private final String Street;
    private final String City;
    private final String State;
    private final String ZipCode;

    public Address(String Street, String City, String State, String ZipCode) {
        this.Street = Street;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }

    public String getStreet() {
        return Street;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    @Override
    public String toString() {
        String sAddress = "Property Address: \n  " +
                getStreet() + "\n  " +
                getCity()+ ", " + getState() + " " + getZipCode() + "\n";                
        
        return sAddress;
                
             
    }
    
     
}
