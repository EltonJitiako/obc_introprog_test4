public class Main {

    public static void main (String[] args){
        int numeroIf = 4;

        //IF
        if(numeroIf<0) {
            System.out.println("its negative");
        } else if (numeroIf==0) {
            System.out.println("its zero");
        } else {
            System.out.println("its positive");
        }


        int numeroWhile = 0;

        //WHILE
        while(numeroWhile<3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //DO WHILE
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while(numeroWhile<3);

        //FOR
        for (int numeroFor=0; numeroFor<=3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "VERANO";

        //SWITCH CASE
        switch (estacion) {
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTONO":
                System.out.println("Es Otono");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case default:
                System.out.println("No es una estacion");
        }

    }

}