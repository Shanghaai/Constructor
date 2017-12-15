package UseOfContructor;

public class MainClass 
{
	   public static void main(String[] a)
	   {
		   System.out.println("PROGRAM STARTED");
		   Mobile s = new Mobile();
		   Mobile s1  = new Mobile("samsung", 464, "android"); //1st object s1
	       System.out.println("");  
	       
	       //earliar it was like this and now----
	       /*s1.displayF("samsung",686464," android");
	       
	       System.out.println("");  
	       
	       s1.displayF("iphone",46462,"ios");
	       System.out.println("");
	       
	       s1.displayF("motorola",44446462,"android 4.4");
	       System.out.println("");*/
	       
/*	      by default methods that are present in s2 or s1 object
	      like toString, wait notify all and many more  	       
*/	       
	       Mobile s2  = new Mobile("iphone", 4646, "IOS"); // second object
	       if(s2.equals(s1));
	       {
	    	   System.out.println("yes they are equal");
	       }
	       
	       int x= s2.hashCode();
	       System.out.println("Hashcode of object s2:"+x);
	       
	       
	       String ss=s2.toString();
	       {
	    	   System.out.println("String representation if the object :"+ss);
	       }
	    }
	   
	   static
	   {
		   System.out.println("its a static block IN main Fuction beta .... so my priority is higher than you");
	   }
}
