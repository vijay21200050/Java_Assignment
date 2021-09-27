class wwe{
    private int rank;
    private String name;
    private int weight;

    public int getrank(){
        return rank;
    }

    public String getname(){
        return name;
    }

    public int getweight(){
        return weight;
    }

    public void setweight(int newweight){
        weight = newweight;
    }

    public void setname(String newname){
        name = newname;
    }

    public void setrank(int newrank){
        rank = newrank;
    }
}
public class Encapsulation{
    public static void main(String args[]){
         wwe obj = new wwe();
         obj.setname("Randy Orton");
         obj.setweight(90);
         obj.setrank(1);
         System.out.println("name: " + obj.getname());
         System.out.println("weight: " + obj.getweight());
         System.out.println("rank: " + obj.getrank());
    } 
}