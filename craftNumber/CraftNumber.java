import java.awt.List;
import java.util.ArrayList;

public class CraftNumber {
  public static void main (String [] args) {
    int expectedCraftNumber = 6;

    CraftNumber cn = new CraftNumber();
    cn.findCraftNumber(expectedCraftNumber);
  }

  public void findCraftNumber (int expectedCraftNumber) {
    int count = 0;
    for (long number = 2 ; number < 1000000000 ; number += 2) {
      if (count == expectedCraftNumber) {
        break;
      } else {
        boolean isCraftNumber = isCraftNumber(number);
        if (isCraftNumber) {
          count++;
          System.out.println(number + " is craft number");
        }
      }
    }
  }

  public boolean isCraftNumber(long number) {
    int result = 1;
    ArrayList<Long> factorsList = new ArrayList<>();

    for (long i = (number / 2) ; i > 1; i--) {
      if (!factorsList.contains(i) && number % i == 0) {
        result += i + (number / i);
        factorsList.add(i);
        factorsList.add(number/i);
      }
    }

    return (result ==  number) ? true : false;
  }
}
