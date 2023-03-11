package classwork.generic;

public class StorageDemo {
    public static void main(String[] args) {
        StorageGeneric<Student> studentStorage = new StorageGeneric<>();
        StorageGeneric<Book> bookStorage = new StorageGeneric<>();
        StorageGeneric<String> nameStorage = new StorageGeneric<>();
        StorageGeneric<Integer> numbers = new StorageGeneric<>();
        StorageGeneric<Student> anotherStudents = new StorageGeneric<>();
        numbers.add(5);
        nameStorage.add("Ani");
        Student student = new Student("Liana", "Stepanyan", 28);
        Book book = new Book("girq1", "description", 5000);
        studentStorage.add(student);
        bookStorage.add(book);
        Student byIndex = studentStorage.getByIndex(0);
        System.out.println(student);
        System.out.println(byIndex);
    }
}
