package chapter8.book;

import java.util.Objects;

public class Book {
   private String title;
   private double price;
    private String author;

    public Book() {
    }

    public Book(String title, double price, String author) {
       this.title = title;
       this.price = price;
       this.author = author;
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
//public boolean equals(Object obj) {
      //if(this == obj) {
        //  return true;
     // }
    //  if(obj instanceof Book){
    //      Book b = (Book) obj;
       //   return title.equals(b.title) && price == b.price && author.equals(b.author);
      //}
       // return false;

  //  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
