public class Flight {

    private String company;
    private String departureDate;
    private String arrivalDate;
    private String departureAirport;
    private String arrvialAirport;

    public Flight(String company, String departureDate, String arrivalDate, String departureAirport, String arrvialAirport) {
        this.company = company;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureAirport = departureAirport;
        this.arrvialAirport = arrvialAirport;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrvialAirport() {
        return arrvialAirport;
    }

    public void setArrvialAirport(String arrvialAirport) {
        this.arrvialAirport = arrvialAirport;
    }
}
