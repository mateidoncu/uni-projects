import java.util.ArrayList;

public class Airline {
    private String name, address, phone;
    private double rating;

    ArrayList<Flight> flights = new ArrayList<Flight>();

    public Airline(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void computeRating(){
        double total = 0;
        int count = 0;
        for(Flight f : flights){
            total += f.getOverallRating();
            count++;
        }
        rating = total / count;
    }

    public void addFlight(Flight f){
        flights.add(f);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
}
