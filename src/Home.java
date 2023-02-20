import java.util.Arrays;

public class Home implements PayForUtilites {

    private String family;
    private Person[] people;
    private int energy;
    private double water;
    private int gas;

    public Home(String family, Person[] people, int energy, double water, int gas) {
        this.family = family;
        this.people = people;
        this.energy = energy;
        this.water = water;
        this.gas = gas;
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

    @Override
    public void expenses() {
        System.out.println("Annual utility bills");
        System.out.println(energy + water * 5 + gas * 5 * 12 + " com");
    }

    @Override
    public String toString() {
        return "Home " +
                "\n family: " + family +
                "\n people: " + Arrays.toString(people) +
                "\n energy: " + energy +
                "\n water: " + water +
                "\n gas: " + gas ;
    }
}
