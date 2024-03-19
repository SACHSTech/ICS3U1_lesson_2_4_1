class SumToN extends ConsoleProgram {

  /**
  * Given a variable N, compute the sum from 1 to N
  * @author:
  */
  
  public void run() {
    int intN;
    int intSum;


    // get N from the user
    intN = readInt("Enter the value for N: ");

    // initialize sum to 0
    intSum = 0;

    // compute the sum with the loop
    for(int i = 1; i <= intN; i++){
      // update sum
      intSum = intSum + i;
    }

    // output the sum
    System.out.println(intSum);
    
    
  }
}
