abstract class Games{  
    abstract void pcgames();  
  }  
  class csgo extends Games{  
  void pcgames(){
      System.out.println("Csgo is the best game");
    }  
  public static void main(String args[]){  
   Games obj = new csgo();  
   obj.pcgames();  
  }  
  }  