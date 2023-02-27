package chapter9.mypack.defaultinterface;

public interface MyIF {
    int getNumber();
    default String getStrin() {
        return "Объект типа String по умолчанию";
    }
}
class  MyIFImp implements MyIF {
    public int getNumber() {
        return 100;
    }
}
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        System.out.println(obj.getNumber());
        System.out.println(obj.getStrin());
    }
}