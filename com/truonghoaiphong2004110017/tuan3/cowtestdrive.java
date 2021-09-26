
public class cowtestdrive {
    public static void main(String[] args) {
        Cow cow;
        //cow = new COW();
        cow = new Cow(15);
        cow.weight = 15;

        System.out.println("WEIGHT: " + cow.weight);


        cow = new Cow(5);
        System.out.println("WEIGHT: " + cow.weight);
    }
}
