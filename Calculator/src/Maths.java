
public class Maths {
      public double add(double a,double b)
      {
    	  return a+b;
      }
      public double subtract(double a, double b)
      {
    	  return a-b;
      }
      public double division(double a,double b)
      {
    	  return a/b;
      }
      public double multiplication(double a,double b)
      {
    	  return a*b;
      }
      public double power(double a,double b)
      {
    	  for(int i=0;i<b;i++)
    	  {
    		  a*=b;
    	  }
    	  return a;
      }
}
