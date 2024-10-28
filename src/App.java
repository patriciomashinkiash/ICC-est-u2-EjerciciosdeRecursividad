public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        int resultado = rec.factorial(5);
        System.out.println("Resultado final: " + resultado + "\n");

        System.out.println("Resultado final: " + rec.sumaConsecutivos(5) + "\n");

        System.out.println("Resultado final: " + rec.potencia(5, 3) + "\n");

        System.out.println("Resultado final : " + rec.sumaDigitos(234) + "\n");

    }
}
