//user defined exception to check age
public class Video186 {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote");
        } else {
            System.out.println("You are eligible to vote");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        System.out.println(message);
    }
}