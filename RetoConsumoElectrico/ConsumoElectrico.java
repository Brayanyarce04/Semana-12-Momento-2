import java.util.Scanner;

public class ConsumoElectrico {

    public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);

        double lunes, martes, miercoles, jueves, viernes;
        double promedio, promedioAnterior, porcentaje;
        String nivel, resultado;

        System.out.println("Ingrese el consumo del Lunes:");
        lunes = teclado.nextDouble();

        System.out.println("Ingrese el consumo del Martes:");
        martes = teclado.nextDouble();

        System.out.println("Ingrese el consumo del Miércoles:");
        miercoles = teclado.nextDouble();

        System.out.println("Ingrese el consumo del Jueves:");
        jueves = teclado.nextDouble();

        System.out.println("Ingrese el consumo del Viernes:");
        viernes = teclado.nextDouble();

        System.out.println("Ingrese el promedio anterior:");
        promedioAnterior = teclado.nextDouble();

        promedio = (lunes + martes + miercoles + jueves + viernes) / 5;

        if (promedio < 8) {
            nivel = "CONSUMO BAJO";
        } else if (promedio >= 8 && promedio <= 12) {
            nivel = "CONSUMO NORMAL";
        } else if (promedio > 12 && promedio <= 16) {
            nivel = "CONSUMO ALTO";
        } else {
            nivel = "CONSUMO CRÍTICO";
        }

        porcentaje = ((promedio - promedioAnterior) / promedioAnterior) * 100;

        if (porcentaje < 0) {
            resultado = "El consumo disminuyó";
        } else if (porcentaje >= 0 && porcentaje <= 10) {
            resultado = "El consumo aumentó ligeramente";
        } else if (porcentaje > 10 && porcentaje <= 25) {
            resultado = "El consumo aumentó considerablemente";
        } else {
            resultado = "ALERTA: aumento elevado del consumo";
        }

        System.out.println();
        System.out.println("================================");
        System.out.println("   ANALIZADOR DE CONSUMO");
        System.out.println("================================");
        System.out.println();
        System.out.println("Promedio de consumo: " + promedio);
        System.out.println();
        System.out.println("Nivel: " + nivel);
        System.out.println();
        System.out.println("Promedio anterior: " + promedioAnterior);
        System.out.println("Promedio actual: " + promedio);
        System.out.println();
        System.out.println("Variación: " + porcentaje + "%");
        System.out.println();
        System.out.println("Resultado:");
        System.out.println(resultado);

        teclado.close();
    }
}