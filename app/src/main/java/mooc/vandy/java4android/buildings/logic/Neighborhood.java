package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood {

    // TODO - Put your code here.#
    private Neighborhood() {

    }
    public static void print(Building[] buildings,String header, OutputInterface out){
        out.println(header);
        out.println("---------------");
        for (Building b:buildings){
            out.print(b.toString() + "\n");
        }
        out.println();
    }

    public static int calcArea(Building[] buildings){
        int sum=0;
        for (Building b:buildings){
            sum+=b.calcLotArea();
        }
        return sum;
    }

}
