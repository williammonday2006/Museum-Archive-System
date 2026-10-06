public class Main {
    public static void main(String[] args) {
        ArrayCollection<Artifact> catalog = new ArrayCollection<>();

        Artifact a = new Artifact("A101", "Ancient Tool", "Ancient");
        Artifact b = new Artifact("B205", "Renaissance Painting", "Renaissance");
        Artifact c = new Artifact("C309", "Medieval Sword", "Medieval");

        catalog.add(a);
        catalog.add(b);
        catalog.add(c);

        Artifact searchKey = new Artifact("B205", "", "");

        System.out.println("Contains B205: " + catalog.contains(searchKey));
        System.out.println("Found: " + catalog.get(searchKey));

        catalog.remove(searchKey);

        System.out.println("\nAfter removing B205:");
        System.out.println("Size: " + catalog.size());
        System.out.println(catalog);
    }
}