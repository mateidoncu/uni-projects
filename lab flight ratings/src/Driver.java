public class Driver {
    public static void main(String[] args) {
        Flight f1 = new Flight("airline1_flight1");
        Flight f2 = new Flight("airline1_flight2");
        Flight f3 = new Flight("airline1_flight3");

        f1.addFeedback(2, "acceptable");
        f2.addFeedback(3, "ok");
        f3.addFeedback(4, "great");

        f1.features.add("cup holders");
        f1.features.add("pillows");
        f1.features.add("champagne");
        f2.features.add("cup holders");
        f2.features.add("warm food");
        f2.features.add("drinks");
        f3.features.add("cup holders");
        f3.features.add("pillows");
        f3.features.add("drinks");

        f1.computeOverallRating();
        System.out.println("Flight 1 rating = " + f1.getOverallRating());
        System.out.println("Flight 2 rating = " + f2.getOverallRating());
        System.out.println("Flight 3 rating = " + f3.getOverallRating());

        Airline a1 =  new Airline("Blue Air", "Bucharest", "0728746194");
        a1.addFlight(f1);
        a1.addFlight(f2);
        a1.addFlight(f3);

        Platform p = new Platform();
        p.add(a1);

        p.featureFrequency();

        System.out.println(p.frequency);
    }
}
