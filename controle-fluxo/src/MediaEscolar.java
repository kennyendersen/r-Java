import java.util.Locale;
import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua primeira nota: ");
        Double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a sua segunda nota: ");
        Double nota2 = scanner.nextDouble();

        Double media = (nota1 + nota2) / 2;

        if(media > 4.9 && media < 10){
            System.out.println("\033[1;36mAprovado\033[m");
        }
        else{
            System.out.println("\033[1;31mReprovado\033[m");
        }
    }
}
