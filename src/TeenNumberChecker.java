public class TeenNumberChecker {

    public static boolean isTeen(int age) {
        if (age > 12 && age < 20) {
            return true;
        } else return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge)) {
            return true;
        } else return false;
    }
}
