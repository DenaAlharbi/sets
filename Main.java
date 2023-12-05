import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<String, TreeSet<Integer>> majors = new TreeMap<>();
        ArrayList<String> lines = new ArrayList<>();
        String g = "C:\\Users\\denaa\\JavaProjects231\\Lab22\\src\\enrollment.txt";       Scanner input = new Scanner(new File(g));
        if (!(g.isEmpty())) {
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
        }
        /*while (input.hasNextLine()) {
            lines.add(input.nextLine());
        }*/
        //System.out.println(lines);
        for (String line : lines) {
            String[] splitter = line.split(" ");

            String major = splitter[1];

            if (!majors.containsKey(major)) {
                majors.put(major, new TreeSet<>());
            }
            String id = splitter[0];


            majors.get(major).add(Integer.valueOf(id));

        }

        for (String m : majors.keySet()) {
            System.out.println(m + "-" + majors.get(m));
        }
    }
}



