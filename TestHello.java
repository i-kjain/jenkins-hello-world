public class TestHello {
    public static void main(String[] args) {
        String result = HelloWorld.greet();

        if(result.equals("Hello, Jenkins!")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1); // important for Jenkins
        }
    }
}
