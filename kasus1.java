
package week9;
//eugene bryan lee
import java.util.Scanner;
public class kasus1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa Skor Ujiannya?");
        int skorUjian = input.nextInt();
        char grade;
        if (skorUjian >= 90) {
            grade = 'A';
        } else if (skorUjian >= 80) {
            grade = 'B';
        } else if (skorUjian >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Nilai = " + grade);
    }
}
