import java.util.Arrays;

public class Apartment implements PayForUtilites {
    private String family;
    private Person [] people;
    private int energy;
    private  double water;
    private int gas;
    private int apartmentPayment;

    public Apartment(String family, Person[] people, int energy, double water, int gas, int apartmentPayment) {
        this.family = family;
        this.people = people;
        this.energy = energy;
        this.water = water;
        this.gas = gas;
        this.apartmentPayment = apartmentPayment;
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

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getApartmentPayment() {
        return apartmentPayment;
    }

    public void setApartmentPayment(int apartmentPayment) {
        this.apartmentPayment = apartmentPayment;
    }

    @Override
    public void expenses() {
        System.out.println("Annual utility bills and rent");
        System.out.println(energy + water * 4 + gas * 4 * apartmentPayment + " com");
    }

    @Override
    public String toString() {
        return "Apartment" +
                "\n family: " + family +
                "\n people: " + Arrays.toString(people) +
                "\n energy: " + energy +
                "\n water: " + water +
                "\n gas: " + gas +
                "\n apartmentPayment: " + apartmentPayment;
    }
}
