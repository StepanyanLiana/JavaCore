package chapter12.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.sql.SQLOutput;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno3 {
    String str() default "Тестирование";
    int val() default 9000;
}
class Meta3{
@MyAnno3()
public static void myMeth() {
    Meta3 ob = new Meta3();
    try {
        Class<?> c = ob.getClass();
        Method m = c.getMethod("myMeth");
        MyAnno3 anno = m.getAnnotation(MyAnno3.class);
        System.out.println(anno.str() + " " + anno.val()) ;
    } catch (NoSuchMethodException exc) {
        System.out.println("Meтoд не найден.");
    }
}

    public static void main(String[] args) {
        myMeth();
    }
}