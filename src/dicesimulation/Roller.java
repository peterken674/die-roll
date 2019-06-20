package dicesimulation;
import java.util.Random;

/**
 * Class containing the rolling method and the display method.
 * 
 * @author Ken
 */
public class Roller {
    
    private int num,
                num_iterations,
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

//    public void setPrcnt1() {
//        this.prcnt1 = this.counter1/10.00;
//    }

    public String getPrcnt2() {
        String prcnt = String.format("%.2f", prcnt2);
        return prcnt;
    }

//    public void setPrcnt2() {
//        this.prcnt2 = this.counter2/10.00;
//    }

    public String getPrcnt3() {
        String prcnt = String.format("%.2f", prcnt3);
        return prcnt;
    }

//    public void setPrcnt3() {
//        this.prcnt3 = this.counter3/10.00;
//    }

    public String getPrcnt4() {
        String prcnt = String.format("%.2f", prcnt4);
        return prcnt;
    }

//    public void setPrcnt4() {
//        this.prcnt4 = this.counter4/10.00;
//    }

    public String getPrcnt5() {
        String prcnt = String.format("%.2f", prcnt5);
        return prcnt;
    }

//    public void setPrcnt5() {
//        this.prcnt5 = this.counter5/10.00;
//    }

    public String getPrcnt6() {
        String prcnt = String.format("%.2f", prcnt6);
        return prcnt;
    }

//    public void setPrcnt6() {
//        this.prcnt6 = this.counter6/10.00;
//    }
   

    public Roller() {
    }
       
    /*
    * This method generates a random number between 0 and 60, 1000 times, then determines
    * which face was selected in each depending on the range that the generated random number falls on.
    * It then increments the counter for that face to determine how many times a face was selected.
    */
    public void diceRoller(){
        Random random = new Random();        
        for (num_iterations=0 ; num_iterations<1000 ; num_iterations++)
        {
           num = random.nextInt(60);
           
           if(num>=0 && num<10){
               counter1 += 1;
               prcnt1 = counter1/10.00;
           }
           else if(num>=10 && num<20){
               counter2 += 1;
               prcnt2 = counter2/10.00;
           }
           else if(num>=20 && num<30){
               counter3 += 1;
               prcnt3 = counter3/10.00;
           }
           else if(num>=30 && num<40){
               counter4 += 1;
               prcnt4 = counter4/10.00;
           }
           else if(num>=40 && num<50){
               counter5 += 1;
               prcnt5 = counter5/10.00;
           }
           else if(num>=50 && num<60){
               counter6 += 1;
               prcnt6 = counter6/10.00;
           }
        }
        
        
    }
    
    /*
    * This method displays the results on a table.
    *
        public void display(){
            System.out.println("Face\t\tFrequency\t\tPercentage");
            System.out.println("1\t\t" + counter1 + "\t\t\t" + (counter1/10.0) + "%");
            this.setCounter1();
            System.out.println("2\t\t" + counter2 + "\t\t\t" + (counter2/10.0) + "%");
            this.setCounter2();
            System.out.println("3\t\t" + counter3 + "\t\t\t" + (counter3/10.0) + "%");
            this.setCounter3();
            System.out.println("4\t\t" + counter4 + "\t\t\t" + (counter4/10.0) + "%");
            this.setCounter4();
            System.out.println("5\t\t" + counter5 + "\t\t\t" + (counter5/10.0) + "%");
            this.setCounter5();
            System.out.println("6\t\t" + counter6 + "\t\t\t" + (counter6/10.0) + "%");
            this.setCounter6();
           
        }*/
        
}
