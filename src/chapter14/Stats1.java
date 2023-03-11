package chapter14;

public class Stats1<T extends Number> {
    T[] nums;
    Stats1(T[] o) {
        nums = o;
    }
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }
    boolean sameAvg(Stats1<?> ob){
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}
class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats1<Integer> iob = new Stats1<Integer>(inums);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats1<Double> dob = new Stats1<Double>(dnums);
        double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);
        Float[] fnums = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        Stats1<Float> fob = new Stats1<Float>(fnums);
        double x = fob.average();
        System.out.println("Cpeднee значение fob равно" + x);
        System.out.print("Cpeднee значение iob & dob ");

        if (iob.sameAvg(dob)) {
            System.out.println("paвны.");
        } else {
            System.out.println("oтличaютcя.");
        }
        System.out.print("Cpeдниe iob и fob");
        if (iob.sameAvg(fob)) {
            System.out.println("oдинaкoвы.");
        } else {
            System.out.println("oтличaютcя.");
        }
    }
}
