//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int space = 4;
        for (int i = 0; i < 5; i++){
            for (int k = space; k > 0; k--) {
                System.out.print(' ');
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
                System.out.println(' ');
                space--;

        }
    }
}