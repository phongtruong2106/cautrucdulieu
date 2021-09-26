
public class cowtestdrive {
    public static void main(String[] args) {
        COW cow;
        //cow = new COW();
        cow = new COW(15);
        cow.weihgt = 15;

        System.out.println("WEIGHT: " + cow.weihgt);


        cow = new COW(5);
        System.out.println("WEIGHT: " + cow.weihgt);
    }
}
