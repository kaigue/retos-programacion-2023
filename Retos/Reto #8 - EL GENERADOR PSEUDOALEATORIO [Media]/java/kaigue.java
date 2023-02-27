public class kaigue {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(randomNumber());
        }
    }

    private static int randomNumber() {
        return (int) (System.nanoTime() % 101);
    }
}
