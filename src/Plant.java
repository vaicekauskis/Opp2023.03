import java.util.ArrayList;
import java.util.Scanner;

public class Plant {
    public static ArrayList<Plant> plants = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    private static int idCount = 0;  //Statinis laukas

    private final int id;
    private String title;
    private String titleLatin;
    private boolean annualPerennial;
    private String plantContinent;
    private double heightAdultPlantInMeters;
    private boolean edibleInedible;

    public Plant() {
        this.id = ++idCount;
    }

    public Plant(int id) {
        this.id = id;
    }


    public Plant(String title, String titleLatin, boolean annualPerennial, String plantcontinent,
                 int heightAdultPlantInMeters, boolean edibleInedible) {
        this.id = ++idCount;
        this.title = title;
        this.titleLatin = titleLatin;
        this.annualPerennial = annualPerennial;
        this.plantContinent = plantcontinent;
        this.heightAdultPlantInMeters = heightAdultPlantInMeters;
        this.edibleInedible = edibleInedible;

    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public String getTitleLatin() {
        return titleLatin;
    }

    public void setTitleLatin(String titleLatin) {
        this.titleLatin = titleLatin;

    }

    public boolean getAnnualPerennial() {
        return annualPerennial;
    }

    public void setAnnualPerennial(boolean annualPerennial) {
        this.annualPerennial = annualPerennial;

    }

    public String getPlantContinent() {
        return plantContinent;
    }

    public void setPlantContinent(String plantContinent) {
        this.plantContinent = plantContinent;

    }

    public double getHeightAdultPlantInMeters() {
        return heightAdultPlantInMeters;
    }

    public void setHeightAdultPlantInMeters(double heightAdultPlantInMeters) {
        this.heightAdultPlantInMeters = heightAdultPlantInMeters;

    }

    public boolean getedibleInedible() {
        return edibleInedible;
    }

    public void setEdibleInedible(boolean edibleInedible) {
        this.edibleInedible = edibleInedible;

    }

    @Override
    public String toString() {
        return id + ". Augalo pavadinimas: " + title + ". Pavadinimas Lotyniškai : " + titleLatin + ". Vienmetis :" +
                (annualPerennial ? " Taip " : " Ne ") + " Labiausiai paplitęs :" + plantContinent + " Suaugusio augalo aukštis " +
                (heightAdultPlantInMeters == (int) heightAdultPlantInMeters ? ((int) heightAdultPlantInMeters + "") :
                        heightAdultPlantInMeters) + " Metrais " + " Ar valgomas :" + (edibleInedible ? " Taip " : " Ne ");
    }


    public static void printPlants() {
        for (int i = 0; i < plants.size(); i++) {
            System.out.println(plants.get(i));
        }
    }

    public static void addPlants(Scanner sc) {
        Plant plants = new Plant();
        System.out.println("iveskite Augalo pavadinimą");
        plants.setTitle(sc.nextLine());
        System.out.println("iveskite Augalo pavadinimą Lotyniškai");
        plants.setTitleLatin(sc.nextLine());
        System.out.println("iveskite ar augalas vienmetis ");
        plants.setAnnualPerennial(sc.nextBoolean());
        sc.nextLine();
        System.out.println("iveskite Augalo kontinentą");
        plants.setPlantContinent(sc.nextLine());
        System.out.println("iveskite suaugusio augalo aukštį");
        plants.setHeightAdultPlantInMeters(sc.nextInt());
        sc.nextLine();                                                 // nextLine() kad neprasoktu ir eitu užpildytį stulpelį
        System.out.println("iveskite ar augalas valgomas ");
        plants.setEdibleInedible(sc.nextBoolean());
        Plant.plants.add(plants);
    }

    public static void editPlant() {
        System.out.println("iveskite augalą Id kurį norite redaguoti");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).id == id) {
                Plant aa4 = new Plant(id);
                System.out.println("iveskite Augalo pavadinimą");
                aa4.setTitle(sc.nextLine());
                System.out.println("iveskite Augalo pavadinimą Lotyniškai");
                aa4.setTitleLatin(sc.nextLine());
                System.out.println("iveskite ar augalas vienmetis ");
                aa4.setAnnualPerennial(sc.nextBoolean());
                sc.nextLine();
                System.out.println("iveskite Augalo kontinentą");
                aa4.setPlantContinent(sc.nextLine());
                System.out.println("iveskite suaugusio augalo aukštį");
                aa4.setHeightAdultPlantInMeters(sc.nextInt());
                sc.nextLine();
                System.out.println("iveskite ar augalas valgomas ");
                aa4.setEdibleInedible(sc.nextBoolean());
                plants.set(i, aa4);
                break;
            }
        }
    }

    public static void deletePlant() {
        System.out.println("iveskite augalą  Is kurį norite redaguoti");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).id == id) {
                plants.remove(i);
                break;

            }
        }
    }
}















