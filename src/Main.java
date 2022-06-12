import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        MyReflex(new App1(" "));
    }
    public static void MyReflex(Iapp prm) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        for (java.lang.reflect.Field field : prm.getClass().getDeclaredFields()) {
            System.out.println(field.getName());
            System.out.println(field.get(prm).toString());
        }

        for (Constructor constructor : prm.getClass().getConstructors()) {
            System.out.println(constructor.getName() + " ");
        }

        Method method = null;
        String[] mainArgs = new String[0];
        Object obj = prm.getClass();
        try {
            method = prm.getClass().getMethod("Proc1");
        }
        catch (NoSuchMethodException e) {
            try {
                method = prm.getClass().getMethod("Proc2");
            }
            catch (NoSuchMethodException ee) {

            }
        }

        String result = method.invoke(prm, null).toString();
        System.out.println(result);

      //  prm.getClass().getDeclaredFields();

    }
}
