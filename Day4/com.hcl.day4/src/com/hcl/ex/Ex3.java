<<<<<<< HEAD
package com.hcl.ex;

public class Ex3 {
  /** yes javadoc.
 * This is the main method
 * @param args is args.
 */
  public static void main(String[] args) { 
    try { 
      System.out.println("A");
      throw new NullPointerException(); 
    } catch (NullPointerException e) { 
      //System.out.println("Error");
      throw new NumberFormatException();
    } catch (NumberFormatException e) { 
      System.out.println("Rethrowww"); 
    } catch (ArithmeticException e) { 
      System.out.println(e); 
    }
  }
}
=======
package com.hcl.ex;

public class Ex3 {
  /** yes javadoc.
 * This is the main method
 * @param args is args.
 */
  public static void main(String[] args) { 
    try { 
      System.out.println("A");
      throw new NullPointerException(); 
    } catch (NullPointerException e) { 
      //System.out.println("Error");
      throw new NumberFormatException();
    } catch (NumberFormatException e) { 
      System.out.println("Rethrowww"); 
    } catch (ArithmeticException e) { 
      System.out.println(e); 
    }
  }
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
