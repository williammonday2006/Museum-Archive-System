public class Main {
    public static void main(String[] args) {
        LinkedCollection<Artifact> catalog = new LinkedCollection<>();

        catalog.add(new Artifact("A101", "Ancient Tool", "Ancient"));
        catalog.add(new Artifact("B205", "Renaissance Painting", "Renaissance"));
        catalog.add(new Artifact("C309", "Medieval Sword", "Medieval"));

        Artifact searchKey = new Artifact("B205", "", "");

        System.out.println("Contains B205: " + catalog.contains(searchKey));
        System.out.println("Found: " + catalog.get(searchKey));

        catalog.remove(searchKey);

        System.out.println("\nAfter removing B205:");
        System.out.println("Size: " + catalog.size());
        System.out.println(catalog);
    }
}