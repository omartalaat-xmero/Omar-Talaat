package com.mycompany.assignments;
//import static java.lang.Math.sqrt;
public class PrimeNum {
   private int x;
   private boolean y=true;

    public void setX(int x) {
        this.x = x;
    }
    public boolean isY() {
        if (x<1){
            y=false;
        }
        else{
            for(int i=2;i<=x/2;i++){
                if (x%i==0){
                    y=false;
                    break;
                }
            }
        }
        return y;
    }
    
    
    
}
