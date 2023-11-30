import java.util.*;

public class Timers{

long startTime;
long endTime;
long elapsedTime;
Date  d;

// create a date object
public Timers(){
 startTime =0;
 endTime =0;
 elapsedTime=0;
}

public void start(){
   d = new Date();
 startTime =  d.getTime();

}// end class

public void stop(){
 d = new Date();
  endTime = d.getTime();
  elapsedTime = endTime - startTime;
}

public void reset(){
 startTime =0;
 endTime =0;
 elapsedTime=0;
}

public long duration(){
System.out.println(startTime + " " + endTime);
  return elapsedTime;
 }// end duration
 
 }// end class