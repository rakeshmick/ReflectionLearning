package rakesh;

import java.lang.reflect.Method;

/**
 * Created by rakeshprabhakaran on 18/11/2015.
 */
public class ReflectApp {


    public static void main(String[] args){
        try {
            Class noparams[] ={};
            Class stringParam[]= new Class[1];
            stringParam[0] =String.class;

            Class classObject = Class.forName("rakesh.App");

            Object obj= classObject.newInstance();

            Method method= classObject.getDeclaredMethod("printNoParam",noparams);


            method.invoke(obj,null);

            method= classObject.getDeclaredMethod("printString", stringParam);
            method.invoke(obj,"rakesh");

            String name=classObject.getName();
            System.out.println(name);


            Method[] methods = App.class.getMethods();

            for(Method methode : methods){
                System.out.println("method = " + methode.getName());
            }

        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
