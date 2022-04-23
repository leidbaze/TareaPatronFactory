
package patronfactory;

public class DispositivoFactory {
    public static Dispositivo fabrica(int codigo){
        switch (codigo) {
            case Dispositivo.CMPTR_HUAWEI_H1:
                return new Computadora("I5","Huawei",false,true); 
            case Dispositivo.CMPTR_HUAWEI_H2:
                return new Computadora("I3","Huawei",true,true);
            case Dispositivo.CMPTR_APPLE_A1:
                return new Computadora("A12","Apple",true,true); 
            case Dispositivo.CMPTR_XIAOMI_X1:
                return new Computadora("I7","Xiaomi",false,false);
             
            case Dispositivo.PHONE_HUAWEI_H1:
                return new Smartphone("Huawei","Azul turquesa",false,true); 
            case Dispositivo.PHONE_HUAWEI_H2:
                return new Smartphone("Huawei","Rojo rojoso",false,true);
            case Dispositivo.PHONE_APPLE_A1:
                return new Smartphone("Apple","Negro bruh",true,false); 
            case Dispositivo.PHONE_XIAOMI_X1:
                return new Smartphone("Xiaomi","Platino",false,false);    
                
            case Dispositivo.TAB_HUAWEI_H1:
                return new Tablet("Huawei","Azul mar",7.5f,true); 
            case Dispositivo.TAB_HUAWEI_H2:
                return new Tablet("Huawei","Marmol",9.0f,true); 
            case Dispositivo.TAB_APPLE_A1:
                return new Tablet("Apple","Blanco",11.5f,true);
            case Dispositivo.TAB_XIAOMI_X1:
                return new Tablet("Xiaomi","Negro ejecutivo",11.3f,false); 
            default:
                throw new AssertionError();
        }
    }
}
