public class CraftNumber {
  public static void main (String [] args) {
    int count = 0;
    for (long number = 6 ; number < 1000000000; number += 2) {
      boolean isCraftNumber = isCraftNumber(number);
      if (isCraftNumber && count < 5) {
        count++;
        System.out.println(number + " is craft number");
      } else if (isCraftNumber && count == 5) {
        break;
      }
    }
  }

  public static boolean isCraftNumber(long number) {
    int result = 1;

    for (long i = number - 1 ; i > 1; i--) {
      if (number % i == 0) {
        result += i;
      }
    }

    return (result ==  number) ? true : false;
  }
}
