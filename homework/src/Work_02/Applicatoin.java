package Work_02;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Applicatoin {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class cs  =Human.class;
        Constructor<Human> singleConstructor = cs.getConstructor(String.class,String.class,int.class);
        Human human1 = singleConstructor.newInstance("Roman","Sukhai",34);
        System.out.println(human1);
        Field lastNameField = cs.getDeclaredField("lastName");
        Field nameField = cs.getDeclaredField("name");
        Field ageField = cs.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(human1,12);
        nameField.setAccessible(true);
        nameField.set(human1,"Vasul");
        lastNameField.setAccessible(true);
        lastNameField.set(human1,"Dyrt");
        System.out.println(nameField);
        System.out.println(human1);
        Method[] methods = cs.getMethods();
        for (int i = 1 ; i<methods.length;i++){
            Method method = methods[i];
            System.out.println(method);

        }

        methods[1].invoke(human1,"Roman");
    }
}
