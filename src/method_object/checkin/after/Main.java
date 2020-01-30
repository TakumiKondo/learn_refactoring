package method_object.checkin.after;

public class Main {

    public static void main(String...args) {
        Checkin stay1 = new Checkin(1);
        System.out.println("Not VIP :" + stay1.charge(100, 2000, false));
        System.out.println("VIP     :" + stay1.charge(100, 2000, true));
    }
}
