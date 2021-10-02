package Work_01;

import java.lang.reflect.*;
import java.util.Arrays;

public class Apliccation {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Human> cl = Human.class;

        int count = 1 ;
        String name = cl.getName();
        String simpleName = cl.getSimpleName();
        int modifinderForClass = cl.getModifiers();
        String modifinderStringForClass = Modifier.toString(modifinderForClass);
        Package packageClass = cl.getPackage();
        Class[] interfaces = cl.getInterfaces();
        Constructor<?>[] humanCons  = cl.getConstructors();
        Constructor<Human> singleConstructor = cl.getConstructor(int.class,String.class,String.class,int.class);
        Field[] fieldPrivate = cl.getDeclaredFields();
        Method[] methods = cl.getMethods();


        System.out.println("---->"+"["+" Name class : "+ name+" ]");
        System.out.println("-----------------------------------------");
        System.out.println("----> Simple name class : "+ simpleName);
        System.out.println("-----------------------------------------");
        System.out.println("----> Modifinder number:"+modifinderForClass);
        System.out.println("----> Modifinder class letter: "+modifinderStringForClass);
        System.out.println("-----------------------------------------");
        System.out.println("----> Package for class: "+ packageClass);
        System.out.println("-----------------------------------------");
        System.out.println("----> Interface for class: "+ Arrays.toString(interfaces));
        System.out.println("-----------------------------------------");
        for (int i = 0 ; i< humanCons.length;i++){
            Constructor<?> humanCons1 = humanCons[i];
            System.out.println("Constructor "+count+": "+humanCons1);
            count++;
        }
        count = 1;
        System.out.println("-----------------------------------------");
        for (int i = 0 ;i<humanCons.length; i++){
            Constructor<?> humanCons1 = humanCons[i];
            Class<?>[] classParType = humanCons1.getParameterTypes();
            System.out.println("Constructor "+count+" params : ");
            for (int a = 0; a < classParType.length ; a++ ){
                Class<?> classParType1 = classParType[a];
                System.out.println("----> "+classParType1);
            }
            count++;
            System.out.println("--------------------------------");
        }
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("----> Parameters for class: "+singleConstructor);
        System.out.println("-----------------------------------------");
        Human human1 = singleConstructor.newInstance(2,"Roma","Sukhai",34);
        System.out.println("Object in this class:{\n "+"                      "+human1+"\n              }");
        System.out.println("-----------------------------------------");
        System.out.println("Filds private print: \n");
        for (int i = 0 ;i<fieldPrivate.length;i++){
            Field field = fieldPrivate[i];
            System.out.println("----> "+field);
        }
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("Methods print: \n");
        for (int i = 0 ;i<methods.length;i++){
            Method method =methods[i];
            System.out.println("----> "+method);
        }
    }
}
