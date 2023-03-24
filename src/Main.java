import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Plant> plants = new ArrayList<>();
        Plant aa = new Plant();
        aa.setTitle("Rožė. ");
        aa.setTitleLatin("Rosa. ");
        aa.setAnnualPerennial(false);
        aa.setPlantContinent("Kinija. ");
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

        plants.add(aa);
        plants.add(aa2);
        plants.add(aa3);

        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i));

        }

        while (true){

        }












    }
}