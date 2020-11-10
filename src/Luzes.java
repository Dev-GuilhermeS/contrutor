public class Luzes {
    private boolean luz01;
    private boolean luz02;
    
   //construtor 
    public Luzes (boolean luz01, boolean luz02){
        this.luz01 = luz01;
        this.luz02 = luz02;
    }

   //get
    public boolean getLuz01(){
        return this.luz01;
    }
    public boolean getLuz02(){
        return this.luz02;
    }
    
//set
    public void setLuz01(boolean luz01){
         this.luz01 = luz01;
    }
    public void setLuz02(boolean luz02){
         this.luz02 = luz02;
    }

   
}