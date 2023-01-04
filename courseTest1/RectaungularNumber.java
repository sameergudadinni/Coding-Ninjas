Rectangular numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4
4444444
4333334
4322234
4321234
4322234
4333334  
4444444
Input format : N (Total no. of rows)

Output format : Pattern in N lines

Sample Input :
3
Sample Output :
33333
32223
32123
32223
33333
  
  public static void main(String[]args){
  public static void print(int n){
      int a;
    for(int i=-(n-1); i<n; i++){
       a=n;
      for(int j=-(n-1); j<n; j++){
            if(Math.abs(i)<Math.abs(j)){
                  System.out.print(a);
            }
        a--;
        else{
              System.out.print(a);
          a++;
        }
      }else{
          System.out.print(a);
        a++;
      }
      
    }
    System.out.println();
    }
  public static void main(String[]args){
      print(4);
  }
  
  }
