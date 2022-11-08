package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* ******************************* Reflection *******************************
 *
 * Reflection is a library that manipulates classes and everything in it.
 * obs: it can slow down performance because it is dynamically executed, so the JVM can't optimize the code.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Meowy", 5);

        Field[] catFields = cat.getClass().getDeclaredFields();

        for (Field field : catFields) {
            System.out.println("Name: " + field.getName());
            System.out.println();

            if (field.getName() == "name") {
                field.setAccessible(true);
                field.set(cat, "Meowy2");
            }
        }

        System.out.println(cat.getName() + "\n");

        Method[] methods = cat.getClass().getDeclaredMethods();

        for (Method method : methods) {

            if (method.getName().equals("setAge")) {
                method.invoke(cat, 30);
            }

            System.out.println(method.getName());
        }

        System.out.println("\n" + cat.getAge());

    }
}
