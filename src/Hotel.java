import java.util.Arrays;

public class Hotel implements PayForUtilites {
    private String family;
    private Person[] people;
    private int hotelPayment;


    public Hotel(String family, Person[] people, int hotelPayment) {
        this.family = family;
        this.people = people;
        this.hotelPayment = hotelPayment;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }


    public int getHotelPayment() {
        return hotelPayment;
    }

    public void setHotelPayment(int hotelPayment) {
        this.hotelPayment = hotelPayment;
    }

    @Override
    public void expenses() {
        System.out.println("Hotel expenses per month ");
        System.out.println(hotelPayment * 2 * 30 + " com");
    }

    @Override
    public String toString() {
        return "Hotel " +
                "family: " + family +
                "\n people: " + Arrays.toString(people) +
                "\n hotelPayment:" + hotelPayment ;
    }
}
