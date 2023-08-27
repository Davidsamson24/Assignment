package asses1;



public class Mobile1 {
	public void makecall() {
		System.out.println("Make a call");
		
		
	}
	public long sendsms() {
		System.out.println("498496194656");
		return 0;
		
		
	}
	public static void main(String[] args) {
		int noOfmobile =10;
	    boolean ischarging=true;
	    String colour ="Black";
	    char logo='V';
	    float imenumber=326.3844f;
	    
	    System.out.println("no of mobile"+noOfmobile);
	    
	    System.out.println("Is charging"+ischarging);
       System.out.println("Colour"+colour);
       System.out.println("logo"+logo);
       System.out.println("imenumber"+imenumber);
	
	
	Mobile1 v =new Mobile1();
	v.sendsms();
	v.makecall();
	System.out.println("noOfmobile:"+noOfmobile);
	
	}

}
