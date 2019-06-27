public class Main {

    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.isTeen(9) + " should return false");
        System.out.println(TeenNumberChecker.isTeen(13) + " should return true");
        System.out.println(TeenNumberChecker.isTeen(19) + " should return true");

        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19) + " should return true");
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42) + " should return true");
        System.out.println(TeenNumberChecker.hasTeen(13, 86, 42) + " should return true");
        System.out.println(TeenNumberChecker.hasTeen(23, 56, 42) + " should return false");
    }
}
