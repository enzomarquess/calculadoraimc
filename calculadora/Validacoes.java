public class Validacoes {
    public static boolean PesoValido(double peso) {
        return peso > 0 && peso < 500; // Peso em kg deve ser positivo e realista
    }

    public static boolean AlturaValida(double altura) {
        return altura > 0 && altura < 3; // Altura em metros deve ser positiva e realista
    }
}
