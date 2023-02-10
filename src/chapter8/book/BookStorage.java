package chapter8.book;

public class BookStorage {
    private Book[] array = new Book[10];
    int size = 0;

    void add(Book value) {

        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void extend() {
        Book[] array1 = new Book[array.length + 10];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;

    }
    void print() {
        for (int i = 0; i < size; i++) {

            System.out.println(array[i] + " ");
        }
    }


    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
           Book book = array[i];
           if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
               found = true;
               System.out.println(book);
           }
        }
        if(!found) {
            System.out.println("book with " + keyword + "does not exists");
        }
    }
}
