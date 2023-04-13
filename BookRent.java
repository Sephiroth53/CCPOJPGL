import java.util.ArrayList;
import java.util.Scanner;

public class BookRent {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("System Analysis and Design,", "Garry B. Shelly",  2020, 2));
        books.add(new Book("Android Application,", "Corrine Hoisington", 2019, 3));
        books.add(new Book("Programming Concepts and Logic Formulation,", "Rosauro E. Manuel", 2021, 4));

        while (!end) {
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                System.out.println(i + " " + book.getTitle() + " " + book.getAuthor());
            }

            System.out.print("CHOOSE A NUMBER TO RENT YOUR FAVORITE BOOK: ");
            int index = scanner.nextInt();

            if (index >= 0 && index < books.size()) {
                Book book = books.get(index);
                if (book.isAvailable()) {
                    book.borrow();
                    System.out.println("You Rented " + book.getTitle() + ".");
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


    class Book {
        private String title;
        private String author;
        private int year;
        private int copies;

        public Book(String title, String author, int year, int copies) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.copies = copies;
        }

        public String getTitle() {
            return title;
        }
    
        public String getAuthor() {
            return author;
        }
    
        public int getYear() {
            return year;
        }
    
        public int getCopies() {
            return copies;
        }
    
        public boolean isAvailable() {
            return copies > 0;
        }
    
        public void borrow() {
            copies--;
    
        }
    }
