class Main {
  public static void main(String[] args) {
    
   
     // call your method with corresponding arguments
    printpassword("Hello", (byte) 34, 31254L, 56.7F, '&', true, 3256, 's');

  }

  
public static void printpassword(String s, byte b, long l, float f,char ch, boolean isTrueOrFalse, int i,char c){
  System.out.println( "" + c + i + isTrueOrFalse + ch + f + l + b + s);
}


  // create your method here



  
}