import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("---DOG---");
        System.out.println(shouldWakeUp(true, 1)); // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8)); // false
        System.out.println(shouldWakeUp(true, -1)); // false
        System.out.println("---YAŞ---");
        System.out.println(hasTeen2(9, 99, 19)); // true
        System.out.println(hasTeen2(23, 15, 42)); // true
        System.out.println(hasTeen2(22, 23, 34, 50, 62)); // false
        System.out.println("---CAT---");
        System.out.println(isCatPlaying(true, 10)); // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true
        System.out.println("---AREA---");
        System.out.println(area(5.0, 4.0)); // 20.0
        System.out.println(area(-1.0, 4.0)); // -1
        System.out.println("---AREA2---");
        System.out.println(area(5.0)); // 78.53975
        System.out.println(area(-1.0)); // -1

    }

    /**
     * havlama ve saate göre uyanıp uyanmamak
     *
     * @param isBarking havlıyor mu? boolean
     * @param time      saat kaç?
     * @return uyanıp uyanmama boolean
     */
    public static boolean shouldWakeUp(boolean isBarking, int time) {
        if (time < 0 || time > 23)  return false;
        if(!isBarking) return false;
        return (time < 8 || time >= 20);
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean hasTeen2(int... ages){
        for(int age: ages){
            if(age>=13 && age<=19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        if(isSummer){
            return temp>= 25 && temp<=45;
        }
        return temp>=25 && temp<=35;
    }

    public static double area(double num1, double num2) {
        if (num1 < 0 || num2 < 0) {
            return -1;
        }
        return num1*num2;
    }

    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return radius*radius*Math.PI;
    }

}
