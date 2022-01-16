//homework
public class HomeWorkApp {
    //Task 01
    public static void main (String [] args) {
        //Task 06
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    //Task 02
    public  static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //Task 03
    public static void checkSumSign(){
        int a = 9;
        int b = 7;

        if(a+b>= 0){
            System.out.println("Сумма положительная");
            }else{
            System.out.println("Сумма отрицательная");
            }
        }
        // Task 04
    public static  void printColor() {
        int value = 200;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Task 05
   public static void compareNumbers(){
        int a = 50;
        int b = 60;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
   }
    }




