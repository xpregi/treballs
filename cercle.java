package cercle;

public class Cercle<New> {

	 private double x;

	 private double y;

	 Cercle(double xx, double yy)

	  {

	     x=xx;

	     y=yy;     

	  }

	public Cercle(){

	    this.x=0;
	    this.y=0;
	    
	}


	public Cercle(Cercle circum){
	    this.x=circum.x;
	    this.y=circum.y;
	}

	 public static void main(String[] args) {
	        // TODO code application logic here
	      
			Cercle c = new Cercle(3.0,5.0);
	        // System.out.println(o);
	        System.out.println(c);
	       
	    }

	
	 @Override
	 public String toString() {
	 	return "Cercle [x=" + x + ", y=" + y +  "]";
	 } 
     private boolean iguals=false;
     
	 public Boolean equals(Cercle c)
	   {
	      if (x == c.getX()) 
	    	  iguals=true;
	      if (y == c.getY())
	          iguals=true;
		return iguals;
	   }
	 
	
	 
	 public double getX(){
	          return x;
	    }
	    
	 public void setX(double x){
	           this.x=x;
	    }

	 public double getY(){
	          return y;
	    }
	    
	 public void setY(double y){
	           this.y=y;
	    }
	    
}

