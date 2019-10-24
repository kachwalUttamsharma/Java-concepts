<<<<<<< HEAD
package com.hcl.ex;

public class Custom {
  /**
   * 
   * @param a
   * @param b
   * @throws NegativeException.
   * @throws NumberZeroException
   */
  public void sum(int a,int b) throws NegativeException, NumberZeroException { 
    int c;
    boolean flag = true; 
    if (a < 0 || b < 0) { 
      flag = false;
      throw new NegativeException("Negative numbers are not allowed");
    }
    if (a == 0 || b == 0) { 
      flag = false;
      throw new NumberZeroException("Zero is Invalid tooo...");
    }
    if (flag == true) { 
      c = a + b; 
      System.out.println(" Sum is " + c); 
    }
  }
  /**
  * The main entry point.
  * @param args the list of arguments
  * @throws NegativeException throw NumberZeroException.
  */
  
  public static void main(String[] args) {
    int a = 5;
    int b = -12;
    try { 
      new Custom().sum(a,b); 
    } catch (NegativeException | NumberZeroException e) { 
      e.printStackTrace(); 
    }
  }
}
=======
package com.hcl.ex;

public class Custom {
  /**
   * 
   * @param a
   * @param b
   * @throws NegativeException.
   * @throws NumberZeroException
   */
  public void sum(int a,int b) throws NegativeException, NumberZeroException { 
    int c;
    boolean flag = true; 
    if (a < 0 || b < 0) { 
      flag = false;
      throw new NegativeException("Negative numbers are not allowed");
    }
    if (a == 0 || b == 0) { 
      flag = false;
      throw new NumberZeroException("Zero is Invalid tooo...");
    }
    if (flag == true) { 
      c = a + b; 
      System.out.println(" Sum is " + c); 
    }
  }
  /**
  * The main entry point.
  * @param args the list of arguments
  * @throws NegativeException throw NumberZeroException.
  */
  
  public static void main(String[] args) {
    int a = 5;
    int b = -12;
    try { 
      new Custom().sum(a,b); 
    } catch (NegativeException | NumberZeroException e) { 
      e.printStackTrace(); 
    }
  }
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
