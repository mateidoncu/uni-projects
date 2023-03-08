import java.util.*;

public class Main {
    public static void main(String[] args) {
        FlightRepository fr = new FlightRepository();

        LinkedList<String> flightList = new LinkedList<>();
        flightList.addLast("flight1");
        flightList.addLast("flight2");
        flightList.addLast("flight3");

        Set<String> flightsHS = new HashSet<>();
        flightsHS.add("flight1");
        flightsHS.add("flight2");
        flightsHS.add("flight3");
        Set<String> duplicateFlights = new HashSet<>();
        for (int i=0; i<args.length; i++)
            if (!flightsHS.add(args[i]))
                duplicateFlights.add(args[i]);
            flightsHS.removeAll(duplicateFlights);


        TreeSet<Flight> nameComp = new TreeSet<>(new MyNameComp());
        nameComp.add(new Flight("lufthansa", "28-Jan-2022", "28-Jan-2022", "Otopeni", "Charles de Gaulle Airport"));
        nameComp.add(new Flight("british airways", "15-Mar-2022", "15-Mar-2022", "Otopeni", "Heathrow"));
        nameComp.add(new Flight("austrian", "04-Jul-2022", "04-Jul-2022", "Otopeni", "Vienna Airport"));
        for(Flight f : nameComp){
            System.out.println(f);
        }

        FlightQueue fq = new FlightQueue();
        AirController ac1 = new AirController(fq, 1);
        Airport a1 = new Airport(fq,1);
        ac1.start();
        a1.start();
    }

    static class MyNameComp implements Comparator<Flight>{
        @Override
        public int compare(Flight f1, Flight f2){
            return f1.getCompany().compareTo(f2.getCompany());
        }

    }

}
