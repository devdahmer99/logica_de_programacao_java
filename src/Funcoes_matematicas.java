public class Funcoes_matematicas {
    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -1.0;
        double a, b, c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + a);
        System.out.println("Raiz quadrada de " + y + " = " + b);
        System.out.println("Raiz quadrada de 25 = " + c);

        a = Math.pow(x,y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 1.0);
        System.out.println(x + " elevado a "+y+" = "+a);
        System.out.println(x + " elevado ao quadrado = " + b);
        System.out.println("5 elevado ao quadrado = " + c);

        a = Math.abs(y);
        b = Math.abs(z);
        System.out.println("Valor absoluto de "+y+" = "+a);
        System.out.println("Valor absoluto de "+z+" = "+b);
    }
}

/*
 * Funcoes Matematicas em Java:
 * Math.sqrt(x) -> Variável recebe a raiz quadrada de x,
 * Math.pow(x,y) -> Variárveis recebem o resultado de x elevado a y,
 * Math.abs(x) -> Variável recebe o valor absoluto de x;
 */