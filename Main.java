import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Artifact> museumList = new ArrayList<>();

        museumList.add(new Artifact("M04", "Medieval Shield", "Medieval"));
        museumList.add(new Artifact("A01", "Ancient Tool", "Ancient"));
        museumList.add(new Artifact("Z99", "Modern Sculpture", "Modern"));
        museumList.add(new Artifact("B12", "Renaissance Painting", "Renaissance"));

        System.out.println("Before sorting:");
        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }

        Collections.sort(museumList);

        System.out.println("\nAfter sorting:");
        for (Artifact artifact : museumList) {
            System.out.println(artifact);
        }
    }
}