//try-catch vs throws
class Video185 {
    public static void Wait() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    //exception is thrown to JVM and JVM handle it
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println(10/0);//abnormal termination
//        Wait();

    //try-catch block, better approach
    public static void main(String[] args) {
        try {
            Wait();
            System.out.println(10 / 0);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught");
        }
        System.out.println("Rest of the code");
    }
}
