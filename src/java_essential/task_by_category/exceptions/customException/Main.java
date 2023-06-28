package java_essential.task_by_category.exceptions.customException;

public class Main {
    public static void throwCustomException() throws CustomException {
        throw new CustomException("Custom exception");
    }

    public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
