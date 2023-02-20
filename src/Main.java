public class Main {
    public static void main(String[] args) {


        Person[] family1 = {new Person("Talai"),
                new Person("Aida"),
                new Person("Bekzat"),
                new Person("Aizat"),
                new Person("Begimai")};

        Home home = new Home("Duisheevy", family1, 300, 30.75, 120);
        System.out.println(home.toString());
        home.expenses();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        Person[] family2 = {new Person("Duishon"),
                new Person("Gulzat"),
                new Person("Ariet"),
                new Person("Kasiet")};
        Apartment apartment = new Apartment("Shaktanbekovy", family2, 200, 30.75, 120, 6000);
        System.out.println(apartment.toString());
        apartment.expenses();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        Person[] family3 = {new Person("Ermek"),
                new Person("Aijamal")};

        Hotel hotel=new Hotel("Azizovy",family3,2000);
        System.out.println(hotel.toString());
        hotel.expenses();
    }
}