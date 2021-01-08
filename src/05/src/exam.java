import java.util.Scanner;

public class exam {
  public static void main(String[] args) {
    //  Q4.
    int max = 0;
    int[] array = {1, 5, 3, 8, 2};
    for (int i = 0; i < array.length; i++) {
      if (array[i] >= max) {
        max = array[i];
      }
    }
    System.out.println("max : " + max);

    //  Q5.
    int[][] array2 = {
            {95, 86},
            {83, 92, 96},
            {78, 83, 93, 87, 88}
    };
    int sum = 0;
    double avg = 0.0;
    int count = 0;

    for (int i = 0; i < array2.length; i++) {
      for (int j = 0; j < array2[i].length; j++) {
        sum += array2[i][j];
        count++;
      }
    }
    avg = (double) sum / count;
    System.out.println("sum : " + sum);
    System.out.println("avg : " + avg);

    //  Q.6
    boolean run = true;
    int studentNum = 0;
    int[] scores = null;
    Scanner scanner = new Scanner(System.in);

    while (run) {
      System.out.println("---------------------------------------------------------");
      System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
      System.out.println("---------------------------------------------------------");
      System.out.print("선택 > ");

      int selectNo = scanner.nextInt();
      switch (selectNo) {
        case 1:
          System.out.print("학생수 > ");
          studentNum = scanner.nextInt();
          scores = new int[studentNum];
          break;
        case 2:
          for (int i = 0; i < scores.length; i++) {
            System.out.print("scores[" + i + "] > ");
            scores[i] = scanner.nextInt();
          }
          break;
        case 3:
          for (int i = 0; i< scores.length; i++){
            System.out.println("scores[" + i + "] > " + scores[i]);
          }
          break;
        case 4:
          int maxScore = 0;
          int sumScore = 0;
          double avgScore = 0.0;
          for (int i =0;i<scores.length;i++){
            if(scores[i] >= maxScore) {
              maxScore = scores[i];
              sumScore += scores[i];
            }
          }
          avgScore = (double) sumScore / scores.length;
          System.out.println("최고 점수 : " + maxScore);
          System.out.println("평균 점수 : " + avgScore);
          break;
        case 5:
          System.out.println("종료합니다");
          run = false;
          break;
        default:
          System.out.println("숫자를 잘못 입력했습니다");
          break;
      }
    }
  }
}
