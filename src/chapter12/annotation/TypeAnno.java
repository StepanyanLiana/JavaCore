package chapter12.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
public @interface TypeAnno {}
@Target(ElementType.TYPE_USE)
@interface NotZeroLen{}
@Target(ElementType.TYPE_USE)
@interface Unique{}
@Target(ElementType.TYPE_USE)
@interface MaxLen{
    int value();
}
@Target(ElementType.TYPE_PARAMETER)
@interface what {
    String description();
}
@Target(ElementType.FIELD)
@interface EmptyOk{}
@Target(ElementType.METHOD)
@interface Recommended{}
class TypeAnnoDemo<@what(description = "Данные обобщенного типа") T> {
    public @Unique TypeAnnoDemo() { }
    @TypeAnno String str;
    @EmptyOk String test;
    public int f(@TypeAnno TypeAnnoDemo<T> this, int x) {
        return 10;
    }
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }
    public @Recommended Integer f3(String str) {
        return str.length() / 2;
    }
    public void f4()throws @TypeAnno NullPointerException {
    }
    String @MaxLen(10) [] @NotZeroLen[] w;
    @TypeAnno Integer[] vec;
    public static void myMeth(int i) {
        TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();
        Object x = (10);
        Integer y;
        y = (@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMeth(10);
    }
    class  SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {}
}