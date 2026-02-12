import java.io.*;
import java.util.*;

class MyThread implements Runnable{
    
  	// Method to start Thread
    public void run(){
        
      	String str = "Thread is Running Successfully";
        System.out.println(str);
    }

}

public class Thread_runnable{
    
    public static void main(String[] args){
        
        MyThread g1 = new MyThread();
      
        // initializing Thread Object
        Thread t1 = new Thread(g1);
        
      	// Running Thread
      	t1.start();
    }
}

// Key Methods of Thread Class

// Method	           Description
l
// start()	           Start a new thread, calls run()
// run()	           Contains the code to run in the thread
// sleep(ms)	       Pause thread for some milliseconds
// join()	           Wait for another thread to finish
// setPriority()	   Set priority of thread (1-10)
// isAlive()	       Check if thread is running