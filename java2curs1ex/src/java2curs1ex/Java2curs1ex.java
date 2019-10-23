/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2curs1ex;

//import java2curs1ex.Punct;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author MariusPatru
 */
public class Java2curs1ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalArgumentException, InstantiationException, IllegalAccessException {
        Class punctClass = Class.forName("java2curs1ex.Punct");
                //Punct.class;
        String className = punctClass.getSimpleName();
        Class superClass = punctClass.getSuperclass();
        
        ArrayList lista = new ArrayList();
        
        Method[] methods = punctClass.getMethods();
        Field[] fields = punctClass.getFields();
        //lista = punctClass.getModifiers();
        System.out.println(punctClass.getModifiers());
        System.out.println(methods);
        
        //methods.forEach(System.out::println);
        
        for(Method m : methods) {
            System.out.println(m);
        }
        
        for(Field m : fields) {
            System.out.println(m);
        }
        
        Constructor[] constructors = punctClass.getConstructors();
        Constructor constructor = punctClass.getConstructor(new Class[] {int.class, int.class});
        Punct punct = (Punct) constructor.newInstance(5, 6);
        
        System.out.println(punct.toString());
    }
    
    
    
}
