import java.util.*;
/********Задание 2*******
Ввывести в консоль максимальное и минимальное кол-во повторений чисел в массиве*/
public class Task2 {
    static int maxRepeat;
    static int minRepeat;
static void repeatItem() {
Task1.arrayWithSize();
        int [] arr = new int[Task1.max-1];
  for (int i=0; i<Task1.newArr.length-1;i++) {
        if (Task1.newArr[i] == i) {
            arr[i]++;
        }
      Arrays.sort(arr);
        int maxRepeat = arr [0];
        int minRepeat = arr [Task1.max-1];
  }
    System.out.println("Max repeat " + maxRepeat);
    System.out.println("Min repeat " + minRepeat);
}
}
