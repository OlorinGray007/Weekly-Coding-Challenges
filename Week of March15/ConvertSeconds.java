public class ConvertSeconds {

    public static int convertSeconds(int min) {

        return min*60;

    }

    public static void main(String[] args) {
        System.out.println(convertSeconds(3));
        System.out.println(convertSeconds(2));
    }
}