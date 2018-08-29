public class Hello {
    public static void main (String[] args) {
        Student student = new Student();
        String[] nameList = {"Kat", "Smile", "Kwan", "Oscar", "JJ"};
        long[] idList = {6181814026L, 6181512026L, 6081342026L, 6081430126L, 598122026L};
        for (int i = 0 ; i < 5 ; i++) {
            long id = idList[i];
            student.setName(nameList[i]);
            student.setId(id);
            String isValid = student.validateStudentId(id);
            System.out.println("Student ID : " + id + isValid); 
        }
    }

    public String validateStudentId (long id) {
        String temp = Long.toString(id);
        long result = 0;
        int[] numbers = { 3, 1, 7, 2, 1, 3, 7 };
        
        for (int i = 0; i < 7; i++)
        {
            System.out.println(temp.charAt(i));
            result += (temp.charAt(i) - '0') * numbers[i];
        }

        return ((temp.charAt(7) - '0') == (result % 11)) ? " valid" : " invalid";
    }
}