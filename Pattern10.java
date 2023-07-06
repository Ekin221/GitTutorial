public class Pattern10 {
    /*
     * * * * * 
      * * * * 
       * * * 
        * * 
         * 
         * 
        * * 
       * * * 
      * * * * 
    * * * * * *

    
     */
    public static void Pattern(int n) {
      for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            if(j>=i)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    for(int i = 0; i<n; i++){
      for(int j = n-1; j>=0; j--){
          if(i>=j)
          { 
              System.out.print("* ");
          }
          else
          {
              System.out.print(" ");
          }
      }
      System.out.println();
  }    
         
    }
    public static void main(String[] args) {
      Pattern(5);
    }
      
}
