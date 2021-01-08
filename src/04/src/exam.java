public class exam {
  public static void main(String[] args) {
//        Q1.
    int num1 = (int) (Math.random() * 10) + 1;
    int num2 = (int) (Math.random() * 10) + 1;
    while ((num1 + num2) != 5) {
      num1 = (int) (Math.random() * 10) + 1;
      num2 = (int) (Math.random() * 10) + 1;
    }
    System.out.println(num1);
    System.out.println(num2);

//        Q2.
    int i = 0;
    int j = 0;
    for (i = 0; i < 11; i++) {
      for (j = 0; j < 11; j++) {
        if ((i * 4) + (j * 5) == 60) {
          System.out.println("(" + i + ", " + j + ")");
        }
      }
    }
  }
}
