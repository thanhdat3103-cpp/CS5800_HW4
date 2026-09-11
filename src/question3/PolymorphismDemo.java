package question3;

public class PolymorphismDemo {
    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship(
                "Ocean Star",
                "2005"
        );

        ships[1] = new CruiseShip(
                "Royal Voyager",
                "2018",
                3500
        );

        ships[2] = new CargoShip(
                "Global Carrier",
                "2012",
                50000
        );

        for (Ship ship : ships) {
            ship.print();
            System.out.println("------------------------------");
        }
    }
}