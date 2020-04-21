import java.util.Scanner; 
 
public class Calculadora { 
    public static void main(String[] args) {
        Integer a;
        Integer b;
        Integer opcion;
        Integer resultado;
        Scanner teclado = new Scanner(System.in);
        
        try {
            do {
                System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");             
                opcion = Integer.parseInt(teclado.next());
            } while (opcion < 1 && opcion > 4);

            System.out.println("Ingrese el primer numero");             
            a = Integer.parseInt(teclado.next());
            
            System.out.println("Ingrese el segundo numero");
            b = Integer.parseInt(teclado.next()); 

            switch (opcion) {
                case 1:
                    resultado = sumar(a, b);
                    break;
                case 2:
                    resultado = restar(a, b);
                    break;  
                case 3:
                    resultado = multiplicar(a, b);
                    break;  
                case 4:
                    resultado = dividir(a, b);
                    break;  
                default:
                    resultado = 0;
            }
            
            teclado.close();

            System.out.println("El resultado es " + resultado.toString());  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static Integer sumar(Integer a, Integer b) {
        return a + b;
    }

    private static Integer restar(Integer a, Integer b) {
        return a - b;
    }

    private static Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    private static Integer dividir(Integer a, Integer b) {
        return a / b;
    }
} 


















