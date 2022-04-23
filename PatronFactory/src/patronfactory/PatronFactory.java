package patronfactory;

import java.util.Scanner;

public class PatronFactory {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int seleccion = -1;
        
        //El ciclo while existe para hacer las pruebas mas fluidamente
        while (seleccion != 0){
            System.out.println("¿Modelo?");
            System.out.println(Dispositivo.CMPTR_HUAWEI_H1 + ") Laptop Huawei H11");
            System.out.println(Dispositivo.CMPTR_HUAWEI_H2 + ") Laptop Huawei H12");
            System.out.println(Dispositivo.CMPTR_APPLE_A1 + ") Macbook air");
            System.out.println(Dispositivo.CMPTR_XIAOMI_X1 + ") Xiaomi Reacondiconada");

            System.out.println("...) etc");

            System.out.println(Dispositivo.PHONE_HUAWEI_H1 + ") Smarthphone Huawei P11");
            System.out.println(Dispositivo.PHONE_HUAWEI_H2 + ") Smarthphone Honor 23");
            System.out.println(Dispositivo.PHONE_APPLE_A1 + ") iPhone 34");
            System.out.println(Dispositivo.PHONE_XIAOMI_X1 + ") Redmi 9");

            System.out.println("...) etc");

            System.out.println(Dispositivo.TAB_HUAWEI_H1 + ") Tablet Huawei T14");
            System.out.println(Dispositivo.TAB_HUAWEI_H2 + ") Tablet Honor S");
            System.out.println(Dispositivo.TAB_APPLE_A1 + ") iPad 20");
            System.out.println(Dispositivo.TAB_XIAOMI_X1 + ") Tablet Redmi T1");

            System.out.println("0) Salir");
            try {
                System.out.print("Elige la opcion: ");
                seleccion = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("No capturaste un numero");
            }

            Dispositivo dispo = DispositivoFactory.fabrica(seleccion);
            System.out.println(dispo.toString());
        }
    }
    
}
