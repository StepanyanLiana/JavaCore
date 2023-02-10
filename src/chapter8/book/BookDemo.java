package chapter8.book;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
      //  Book book1 = new Book("girq1", 100, "poxos");
       // Book book2 = new Book("girq1", 100, "poxos");
      //  Book book3 = book1;
      //  boolean equals = book1.equals(book3);
       // System.out.println(equals);
        //System.out.println(book1.hashCode());
       // System.out.println(book2.hashCode());
       // System.out.println(book3.hashCode());
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("plese input 0 for exit");
            System.out.println("plese input 1 for add book");
            System.out.println("plese input 2 for print all books");
            System.out.println("plese input 3 for search book by name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("please input books' title");
                    String title = scanner.nextLine();
                    System.out.println("please input book's price");
                    String price = scanner.nextLine();
                    System.out.println("please input book's author");
                    String author = scanner.nextLine();
                    Book book = new Book(title, Double.parseDouble(price), author);
                    bookStorage.add(book);
                    System.out.println("Book is created");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("please input keyword");
                   String keyword = scanner.nextLine();
                   bookStorage.searchByName(keyword);
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");



            }
        }

    }
}
