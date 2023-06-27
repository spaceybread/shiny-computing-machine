public class sieve {
  public static void main(String[] args) {

    //finds prime up until this value
    int upperLimit = 10000;

    int allNumbers[] = new int[upperLimit];

    //filling array with numbers incremented by 1
    for (int i = 0; i < allNumbers.length; i++) {
      allNumbers[i] = i + 1;
    }

    //sieve begins with 2,
    for (int primeI = 2; primeI < allNumbers.length; primeI++) {
      if (!(allNumbers[primeI] == 999)) {
        for (int j = allNumbers[primeI] + 1; j < allNumbers.length; j++) {
          if (allNumbers[j] % allNumbers[primeI] == 0) {
            allNumbers[j] = 999;
          }
        }
      }
    }

    //sets all crossed out numbers with 999, which is not prime

    //prints out the remaining number list, starts at 1st entry instead of 0th to avoid printing the number one
    for (int k = 1; k < allNumbers.length; k++) {
      if (!(allNumbers[k] == 999)) {
        System.out.println(allNumbers[k]);
      }
    }
  }
}
