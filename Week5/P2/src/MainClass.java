import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String args[]) throws NoSuchMethodException {
        List<Class> classList = new ArrayList<Class>();
        classList.add(Day.class);
        classList.add(Month.class);
        classList.add(Week.class);
        List<Method> methodList = new ArrayList<Method>();
        methodList.add(Day.class.getDeclaredMethod("toString", null));
        methodList.add(Month.class.getDeclaredMethod("toString", null));
        methodList.add(Week.class.getDeclaredMethod("toString", null));

        for (Class classObject : classList) {
            Annotation[] annotations = classObject.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Logged) {
                    Logged myAnnotation = (Logged) annotation;
                    System.out.println(classObject.getName() + "Annotated");

                }
            }
        }
        for (Method methodObject : methodList) {
            Annotation[] annotations = methodObject.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                if (annotation instanceof Logged) {
                    Logged myAnnotation = (Logged) annotation;
                    System.out.println(methodObject.getDeclaringClass() + " " + methodObject.getName() + " " + "Annotated");

                }
            }
        }
    }
}
