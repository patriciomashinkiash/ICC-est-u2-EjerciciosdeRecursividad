public class Recursividad {

    public int factorial(int n) {
        System.out.println("Calculando el factorial de: " + n);
        // caso base: n sea 0! y 1! son iguales a 1
        if (n == 0 || n == 1) {
            System.out.println("Caso base alcanzado el factorial de" + n + " es 1");
            return 1;
        }

        int resultado = n * factorial(n - 1);
        System.out.println("Resultado parcial para " + n + " * factorial (" + (n - 1) + ") = " + resultado);
        return resultado;
    }

    // CALCULAR LA SUMA DE LOS NUMEROS CONSECUTIVOS
    // n = 5 resultado = 5+4+3+2+1 = 15
    public int sumaConsecutivos(int n) {
        System.out.println("Calculando la suma de los numeros consecutivos de: " + n);
        if (n == 1) {
            System.out.println("Caso base alcanzado el factorial de" + n + " es 1");
            return 1;
        }

        int resultado = n + sumaConsecutivos(n - 1);
        System.out.println("Resultado parcial para " + n + " + (" + (n - 1) + ") = " + resultado);
        return resultado;
    }

    // CALCULA LA POTENCIA DE NUMERO
    public int potencia(int base, int exponente) {
        System.out.println("Calculando la potencia de " + base + " elevado a: " + exponente);
        if (exponente == 0) {
            return 1;
        }

        int resultado = base * potencia(base, exponente - 1);
        System.out.println("Resultado parcial para " + base + "^" + (exponente) + " = " + resultado);
        return resultado;
    }

    // CREAR UN METODO QUE SUME LOS DIGITOS DE UN NUMERO
    // SI MANDO 456 SEA IGUAL A 4+5+6 = 15
    // PISTA SE USA % MOD

    public int sumaDigitos(int numero) {
        System.out.println("Calculando la suma de los digitos de: " + numero);
        if (numero < 10) {
            return numero;
        }

        int resultado = (numero % 10) + sumaDigitos(numero / 10);
        System.out.println("Resultado parcial para " + numero + " % 10 + (" + (numero / 10) + ") = " + resultado);
        return resultado;

    }

}