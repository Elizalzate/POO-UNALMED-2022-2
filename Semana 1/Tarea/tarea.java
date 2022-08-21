import java.util.*;
class Tarea{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean Run = true;
        System.out.println(menu());

        while (Run){
            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("""
                            A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a\s
                            Juan su edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan \s
                            y mi edad es la suma de las tres""");
                    System.out.println("Ingresa la edad de Juan");
                    System.out.println(edades(scanner.nextDouble()));
                    System.out.println(menu());
                }
                case "2" -> {
                    System.out.println("Prueba de escritorio");
                    System.out.println(pruebaEscritorioSuma());
                    System.out.println(menu());
                }
                case "3" -> {
                    System.out.println("""
                            Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de\s
                            retención en la fuente es del 12,5% del salario bruto. Se desea saber cuál es el salario bruto,\s
                            la retención en la fuente y el salario neto del trabajador.\s
                            """);
                    System.out.println(salario());
                    System.out.println(menu());
                }
                case "4" -> {
                    System.out.println("Ingrese un número para calcular su cuadrado y su cubo");
                    System.out.println(cuadradoCubo(scanner.nextDouble()));
                    System.out.println(menu());
                }
                case "5" -> {
                    System.out.println("Ingrese el radio de un círculo para calcular el área y su circunferencia");
                    System.out.println(areaCircunferencia(scanner.nextDouble()));
                    System.out.println(menu());
                }
                case "6" ->  Run = false;
            }
        }

    }

    public static String menu(){
        return """
                ¿Qué punto de la tarea desea ejecutar?\s
                1. Ejecicio resuelto #4       2. Ejercicio resuelto #5.\s
                3. Ejercicio propuesto #12    4. Ejercicio propuesto #14\s
                5. Ejercicio propuesto #17    6. Para salir del programa""";
    }

    public static String edades(double edadJuan){
        double edadAlberto = edadJuan * 2/3;
        double edadAna = edadJuan * 4/3;
        double edadMamaJuan = edadJuan + edadAlberto + edadAna;
        return "Las edades son: \nJuan " + edadJuan +
                ", Alberto " + edadAlberto + ", Ana " + edadAna + " y la mamá " + edadMamaJuan + "\n";
    }

    public static String pruebaEscritorioSuma(){
        double suma = 0, x = 20, y = 40;
        suma += x;
        x += y*y;
        suma += x/y;

        return "La suma es " + suma +"\n";
    }

    public static String salario(){
        double valorHora = 5000, horas = 48, porcentajeReteFuente = 0.125;
        double salario = valorHora*horas, reteFuente = (salario*porcentajeReteFuente);

        return  "El salario bruto es $" + salario +
                "\nLa retención en la fuente es $" + reteFuente +
                "\nEl salario neto es $" + (salario - reteFuente) + "\n";
    }

    public static String cuadradoCubo(double x){
        return "El cuadrado del número es " + Math.pow(x,2) + " y el cubo es " + Math.pow(x,3) + "\n";
    }

    public static String areaCircunferencia(double r){
        double area = 2 * Math.PI * Math.pow(r,2);
        double circunferencia = 2 * Math.PI * r;
        return "El área del círculo es " + String.format("%.3f",area) +
                " y  la longitud de su circunferencia es " + String.format("%.3f",circunferencia) + "\n";
    }
}