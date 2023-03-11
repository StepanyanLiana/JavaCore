package classwork;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationMain {
    @ExampleAnnotation
    public void someMethod() {

    }

    @ExampleAnnotation
    public void myMethod() {
        System.out.println("hello");
    }

    @ExampleAnnotation
    public static void main(String[] args) {
        AnnotationMain annotationMain = new AnnotationMain();
        Method[] declaredMethods = annotationMain.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("method name is " + declaredMethod.getName());
            Annotation[] declaredAnnotations = declaredMethod.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                if (declaredAnnotation instanceof ExampleAnnotation) {
                    System.out.println("our ExampleAnnotation is present");
                }
            }
        }
    }
}