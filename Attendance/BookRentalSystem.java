import java.util.ArrayList;
import java.util.Scanner;

public class BookRentalSystem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("System Analysis and Design,", "Garry B. Shelly",  2));
        books.add(new Book("Android Application,", "Corrine Hoisington", 3));
        books.add(new Book("Programming Concepts and Logic Formulation,", "Rosauro E. Manuel", 4));
        

        while (!end) {
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out.println(i + " " + book.get_Name() + " " + book.get_Author());
            }

            System.out.print("CHOOSE A NUMBER TO RENT YOUR FAVORITE BOOK: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < books.size()) {
                Book book = books.get(index);
                if (book.isAvailable()) {
                    book.borrow();
                    System.out.println("You Rented " + book.get_Name() + ".");
                } else {
                    System.out.println("No Copies Available");
                }
            } else {
                System.out.println("INDEX DOES NOT EXIST, Try Again!");
            }

            System.out.print("RENT AGAIN Y/N? ");
            String repeatprocess = scanner.next();
            if (!repeatprocess.equalsIgnoreCase("Y")) {
                end = true;
                System.out.print("PROGRRAM ENDS");
            }
        }
        scanner.close();
    }
}
