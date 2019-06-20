package dicesimulation;
import java.util.*;

/**
 * Class containing the rolling method and the display method.
 * 
 * @author Ken
 */
public class Roller {
    
    private int num_iterations,
                counter1,
                counter2,
                counter3,
                counter4,
                counter5,
                counter6;
    private double prcnt1, 
                prcnt2, 
                prcnt3, 
                prcnt4, 
                prcnt5, 
                prcnt6;

    public String getCounter1() {
        String counter = Integer.toString(counter1);
        return counter;
    }

    public void setCounter1() {
        this.counter1 = 0;
    }

    public String getCounter2() {
        String counter = Integer.toString(counter2);
        return counter;
    }

    public void setCounter2() {
        this.counter2 = 0;
    }

    public String getCounter3() {
        String counter = Integer.toString(counter3);
        return counter;
    }

    public void setCounter3() {
        this.counter3 = 0;
    }

    public String getCounter4() {
        String counter = Integer.toString(counter4);
        return counter;
    }

    public void setCounter4() {
        this.counter4 = 0;
    }

    public String getCounter5() {
        String counter = Integer.toString(counter5);
        return counter;
    }

    public void setCounter5() {
        this.counter5 = 0;
    }

    public String getCounter6() {
        String counter = Integer.toString(counter6);
        return counter;
    }

    public void setCounter6() {
        this.counter6 = 0;
    }

    public String getPrcnt1() {
        String prcnt = String.format("%.2f", prcnt1);
        return prcnt;
    }

    public String getPrcnt2() {
        String prcnt = String.format("%.2f", prcnt2);
        return prcnt;
    }

    public String getPrcnt3() {
        String prcnt = String.format("%.2f", prcnt3);
        return prcnt;
    }

    public String getPrcnt4() {
        String prcnt = String.format("%.2f", prcnt4);
        return prcnt;
    }

    public String getPrcnt5() {
        String prcnt = String.format("%.2f", prcnt5);
        return prcnt;
    }

    public String getPrcnt6() {
        String prcnt = String.format("%.2f", prcnt6);
        return prcnt;
    }

    public Roller() {
    }
       
    /*
    * This method generates a random number between 0 and 60, 1000 times, then determines
    * which face was selected in each depending on the range that the generated random number falls on.
    * It then increments the counter for that face to determine how many times a face was selected.
    */
    public void diceRoller(){
        //Random random = new Random();        
        for (num_iterations=0 ; num_iterations<1000 ; num_iterations++)
        {
           //num = random.nextInt(60);
            double num = Math.random();
            //double side1 = 
           
           if(num>=0 && num< (1/6.0)){
               counter1 += 1;
               prcnt1 = counter1/10.00;
           }
           else if(num>=(1/6.0) && num<(2/6.0)){
               counter2 += 1;
               prcnt2 = counter2/10.00;
           }
           else if(num>=(2/6.0) && num<(3/6.0)){
               counter3 += 1;
               prcnt3 = counter3/10.00;
           }
           else if(num>=(3/6.0) && num<(4/6.0)){
               counter4 += 1;
               prcnt4 = counter4/10.00;
           }
           else if(num>=(4/6.0) && num<(5/6.0)){
               counter5 += 1;
               prcnt5 = counter5/10.00;
           }
           else if(num>=(5/6.0) && num< 1.0){
               counter6 += 1;
               prcnt6 = counter6/10.00;
           }
        }
        
        
    }
        
}
