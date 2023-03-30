import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Plant aa = new Plant();
        aa.setTitle("Rožė");
        aa.setTitleLatin("Rosa");
        aa.setAnnualPerennial(false);
        aa.setPlantContinent("Kinija");
        aa.setHeightAdultPlantInMeters(7);
        aa.setEdibleInedible(true);

        Plant aa2 = new Plant();
        aa2.setTitle("Triskiautė žibuoklė. ");
        aa2.setTitleLatin("Hepatica nobilis. ");
        aa2.setAnnualPerennial(true);
        aa2.setPlantContinent("Europa. ");
        aa2.setHeightAdultPlantInMeters(0.25);
        aa2.setEdibleInedible(false);

        Plant aa3 = new Plant("Saulėgrąža", "Helianthus", true, "Europa",
                3, true);

        Plant.plants.add(aa);
        Plant.plants.add(aa2);
        Plant.plants.add(aa3);

        while (true) {
            System.out.println("1. Pamatyti augalų sąrašą");
            System.out.println("2. Pridėti augalą");
            System.out.println("3. Redaguoti augalą");
            System.out.println("4. Ištrinti augalą");
            System.out.println("5. Išeiti iš programos");
            int input = sc.nextInt();
            sc.nextLine();
            switch (input) {
                case 1:
                    Plant.printPlants();

                    break;
                case 2:
                    Plant.addPlants(sc);
                    break;
                case 3:
                    Plant.editPlant();

                    break;
                case 4:
                    Plant.deletePlant();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pasirinkite validižią opciją");
                    break;
            }
        }


    }
}