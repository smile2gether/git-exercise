public class Hello {
    public static void main (String[] args) {
        String name = "Kat";
        long ID = 6181506326L;
        Hello hello = new Hello();
        String isValid = hello.validateStudentId(ID);
        System.out.println("ID : " + ID + isValid);
    }

    public String validateStudentId (long id) {
        String temp = Long.toString(id);
        System.out.println(temp);
        long result = 0;
        int[] numbers = { 3, 1, 7, 2, 1, 3, 7 };
        for (int i = 0; i < 7; i++)
        {
            System.out.println(temp.charAt(i));
            System.out.println("=" + temp.charAt(i) + "*" + numbers[i] + "=" + ((int)temp.charAt(i) - '0') * numbers[i]);
            result += (temp.charAt(i) - '0') * numbers[i];
        }
        System.out.println(result);
        return ((temp.charAt(7) - '0') == (result % 11)) ? " valid" : " invalid";
    }
}