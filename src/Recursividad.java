public class Recursividad {

    public int factorial(int n) {
        // caso base: n sea 0! y 1! son iguales a 1
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}