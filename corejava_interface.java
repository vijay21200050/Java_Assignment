interface anime{  
    void best();  
}  
class naruto implements anime{  
    public void best(){
        System.out.println("Naruto is the best anime");
}  
public static void main(String args[]){  
    naruto obj = new naruto();  
    obj.best();  
    }  
}  