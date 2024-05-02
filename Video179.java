//finalize method
public class Video179 {
    public static void main(String[] args) {
        Video179 obj = new Video179();
        obj = null;
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called");

    }
}
