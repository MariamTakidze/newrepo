package com.solvd.reflection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.lang.reflect.*;

public class Reflectiontest  {
    private static final Logger LOGGER = LogManager.getLogger(Reflectiontest.class);
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException, InstantiationException {
            ReflectionPerson myPerson = new ReflectionPerson("Maree","Gango",28);
            Field[] personFields = myPerson.getClass().getDeclaredFields();
            for(Field field: personFields){
                if(field.getName().equals("firstName")){
                    field.setAccessible(true);
                    field.set(myPerson,"Giordanno Brunno");
              }
               LOGGER.info(myPerson.getFirstName());

            Method [] personMethods = myPerson.getClass().getDeclaredMethods();
            for(Method method : personMethods){
                if(method.getName().equals("think")) {
                    method.setAccessible(true);
                    method.invoke(myPerson);
                    myPerson.think();
                }else if(method.getName().equals("help")){
                        method.setAccessible(true);
                        method.invoke(null);
                }

            }
            Class<?> myClass = Class.forName("com.solvd.reflection.ReflectionPerson");
            Constructor[] constructors=myClass.getDeclaredConstructors();
                LOGGER.info("\t\t\tConstructor");
                for (Constructor constructor :constructors) {
                    LOGGER.info(Modifier.toString(constructor.getModifiers())+" "+constructor.getName()+" "+ Arrays.toString(constructor.getParameters()));
                }
//                Class<?> myClass = Class.forName("com.solvd.reflection.ReflectionPerson");
//                Method method = myClass.getMethod("goodbye",String.class);
//                Object obj = myClass.newInstance();
//                String output = (String)method.invoke(obj,"Daniel");
//                LOGGER.info(output);

            }
    }
}
