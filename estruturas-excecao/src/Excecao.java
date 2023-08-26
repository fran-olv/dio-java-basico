import java.text.NumberFormat;

public class Excecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        valor = NumberFormat.getInstance().parse("a1.75");
        
        System.out.println(valor);
       
    }
}
