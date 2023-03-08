import java.util.*;

public class Platform {
    ArrayList<Airline> airlines = new ArrayList<Airline>();
    Map<String, Integer> frequency = new HashMap<String, Integer>();

    public void add(Airline a){
        this.airlines.add(a);
    }

    public void featureFrequency(){
        frequency.clear();
        for(Airline a : airlines){
            for(Flight f : a.flights)
                for(String s : f.features)
                    if(frequency.get(s) != null) {
                        int temp = frequency.get(s);
                        temp++;
                        frequency.put(s, temp);
                    }
                    else
                        frequency.put(s, 1);
        }
    }

}
