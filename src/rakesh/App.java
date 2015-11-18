package rakesh;

/**
 * Created by rakeshprabhakaran on 18/11/2015.
 */
public class App {

    int counter;

    public void printNoParam(){
        System.out.println("print no param");
    }


    public void printInt(int num){
        System.out.println("print int as param");
    }


    public void printString(String string){
        System.out.println("print string as param");
    }


    public void setCounter(int counter){
        this.counter=counter;
        System.out.println("print no param");
    }


    public void printCounter(){
        System.out.println("counter: "+counter);
    }

}
