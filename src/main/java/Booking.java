public class Booking {

    private int nightsBooked;
    private Bedroom bedroom;

    public Booking(int nightsBooked, Bedroom bedroom){
        this.nightsBooked = nightsBooked;
        this.bedroom = bedroom;
    }


    public int getNumberOfNightsBooked() {
        return this.nightsBooked;
    }

    public Bedroom getBedroomBooked() {
        return this.bedroom;
    }
}