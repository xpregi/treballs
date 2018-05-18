public class Cercle{

 private float x;

 private float y;

 Cercle(float xx, float yy)

  {

     x=xx;

     y=yy;     

  }

public Cercle(){

    this.x=0.0;
    this.y=0.0;
    
}


public Cercle(Cercle circum){
    this.x=circum.x;
    this.y=cirsum.y;
}

 public static void main(String[] args) {
        // TODO code application logic here
      
     
        Cercle c = New Cercle();
        // System.out.println(o);
        System.out.println(c);
       
    }

@override
public String toString(){
return  "La funcio toString: "+x+" i: "+y;
}

public Boolean equals(nom n){
Cercle c = (Cercle)n;

return c.getX().equals(this.getX());


}

 public Double getX(){
          return x;
    }
    
    public void setX(Double x){
           this.x=x;
    }

public Double getY(){
          return y;
    }
    
    public void setY(Double y){
           this.y=y;
    }

