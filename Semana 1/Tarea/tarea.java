import java.util.*;
class Tarea{
    public static void main(String[] args){
        System.out.println("¿Qué punto de la tarea desea ejecutar?");
        System.out.println("4 (1), 5(2), 12(3), 14(4), 17(5)");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1":
                System.out.println("A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su \n" +
                        "edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es \n" +
                        "la suma de las tres");
                System.out.println("Ingresa la edad de Juan");
                System.out.println(edades(scanner.nextDouble()));
                break;
            case "2":
                System.out.println(pruebaEscritorioSuma());
                break;
            case "3":
                System.out.println(salario());
                break;
            case "4":
                System.out.println("Ingrese un número para calcular su cuadrado y su cubo");
                System.out.println(cuadradoCubo(scanner.nextDouble()));
                break;
            case "5":
                System.out.println("Ingrese el radio de un círculo para calcular el área y su circunferencia");
                System.out.println(areaCircunferencia(scanner.nextDouble()));
                break;
        }

        System.out.println(scanner.nextLine());
    }

    public static String edades(double edadJuan){
        double edadAlberto = edadJuan * 2/3;
        double edadAna = edadJuan * 4/3;
        double edadMamaJuan = edadJuan + edadAlberto + edadAna;
        return "Las edades son: Juan " + edadJuan +
                ", Alberto " + edadAlberto + ", Ana " + edadAna + " y la mamá " + edadMamaJuan;
    }

    public static String pruebaEscritorioSuma(){
        double suma = 0, x = 20, y = 40;
        suma += x;
        x += y*y;
        suma += x/y;

        return "La suma es " + suma;
    }

    public static double salario(){
        double valorHora = 5000, horas = 48, reteFuente = 0.125;
        double salario = valorHora*horas;

        return salario - (salario*reteFuente);
    }

    public static String cuadradoCubo(double x){
        return "El cuadrado del número es " + Math.pow(x,2) + " y el cubo es " + Math.pow(x,3);
    }

    public static String areaCircunferencia(double x){

        return "El área del circulo es ";
    }
}