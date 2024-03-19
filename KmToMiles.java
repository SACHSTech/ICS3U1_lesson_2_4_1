class KmToMiles extends ConsoleProgram {

  /**
  * display a conversion tables from km to miles
  * @author:
  */
  
  public void run() {
    double dblMiles;

    for (int intKm = 10; intKm <= 100; intKm += 10){
      dblMiles = intKm * 0.621371;
      System.out.println(intKm + " ---> " + dblMiles);  
    }
    
    
  }
}
