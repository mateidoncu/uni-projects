import java.util.ArrayList;

public class FlightRepository implements FlightRepositoryI{
    ArrayList<Flight> flights = new ArrayList<>();

    public void addFlight(Flight f){
        this.flights.add(f);
    }

    public ArrayList<Flight> getFlight(){
        return flights;
    }

    @Override
    public void method() {

    }
}
