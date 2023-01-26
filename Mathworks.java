public class Main {
  public static void main(String[] args) {
    System.out.println(" Math Function");
    System.out.println("Square root =" + Math.sqrt(63));
    System.out.println("Absolute value = " + Math.abs(3-6));
    System.out.println("The 6 raise to the power of 3 = "+ Math.pow(6,3));
    System.out.println("The exponent of 3 = " + Math.exp(3));
    System.out.println("The cube root is = " + Math.cbrt(63));
   
    
// IF
    System.out.println("IF");
    if (3>6) {
  System.out.println("3 is greater than 6");
} else if (3<6) {
  System.out.println("3 is less than 6");
} else {
  System.out.println("3 is equal to 6");
}

// Ternary Operator
System.out.println("Ternary Operator");
int a = 3;
String result = (3 < 6) ? "3 is less than 6" : "3 is not less than 6";
System.out.println(result);
String resulta = (3 > 6) ? "3 is greater than 6" : "3 is not greater than 6";
System.out.println(resulta);
String resultb = (3 == 6) ? "3 is equal to 6" : "3 is not equal to 6";
System.out.println(resultb);

//Logical Operators
System.out.println("Logical Operator");
int msd = 6;
int lsd = 3;
System.out.println(msd & lsd);
System.out.println(msd|lsd);
System.out.println(msd^lsd);
System.out.println(msd!=lsd);



System.out.println(msd < lsd && msd >lsd);
System.out.println(msd < lsd || msd >lsd);
System.out.println(!(msd < lsd) && !(msd >lsd));
System.out.println(!(msd < lsd && msd >lsd));


// Switch 
int m0 = 3;
int m1 = 6;
switch (m1 * m0){
  case 18:
   System.out.println(" The answer is 18");
    break;
  case 5:
    System.out.println("The answer is 5");
}



// For 

for (int i = 0; i<= 99; i++){
  if (i == 63){
    System.out.println(i);
  }
}
  }
}