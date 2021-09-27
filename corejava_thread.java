public class Main{
    public static void main (String[] args) {
      fetch_Data t1 = new fetch_Data();
      processData t2 = new processData("T2");
      synchronized(t2){
      t1.start();
      try{
          Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Error" + e);
        }
      t2.t1.start();
        try (Timeout t = Timeout.after(10, TimeUnit.SECONDS))
        {
            System.out.println("Thread has not timed out");
        } 
        catch (InterruptedException e)
        {
            System.out.println("Thread Timed out with exception " + e);
        }
      }
    }
  }
   
class fetch_Data extends Thread{  
    public void run(){
        System.out.println("Thread 1 is running");
    }  
}
class processData implements runnable {
    public void run() {
        System.out.println("Thread 2 is running");
    }
}