import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class task1 {
    public static void main(String[] args) throws IOException {
        String data;
        //ArrayList<String> list = new ArrayList(); //task1
        //HashSet<String> hs = new HashSet(); //task2
        TreeSet<String> tr = new TreeSet<>(); //task3

        try (BufferedReader bf = new BufferedReader(new FileReader("student.txt"))) {
            while ((data = bf.readLine()) != null) {
                tr.add(data);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println("List of name: " + tr.size());

        Iterator<String> iter = tr.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }
    }
}
