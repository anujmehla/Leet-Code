import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
    String name;
    int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
public class JVM {
    public static void main(String[] args) {

        // String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
        System.out.println(String.class.getClassLoader());

        // Test class is loaded by Application loader
        System.out.println(JVM.class.getClassLoader());
//        Student s1 =new Student();
//        Class c1 = s1.getClass();
//        System.out.println(c1);
//        Method m1[] = s1.getClass().getDeclaredMethods();
//        for (Method m:m1){
//            System.out.println(m+" ");
//        }
//        Field field[] = s1.getClass().getDeclaredFields();
//        for (Field f:field){
//            System.out.println(f);
//        }
    }
}
