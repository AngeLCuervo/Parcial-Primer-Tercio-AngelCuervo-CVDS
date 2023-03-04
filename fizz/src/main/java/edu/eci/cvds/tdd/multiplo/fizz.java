package main.java.edu.eci.cvds.tdd.multiplo;

public class fizz{
    public static void main(String[] args) {
        int contador = 0;
        int num = 1;
        String result = "";
        
        while (contador < 100) {
            if (num % 3 == 0 || contieneDigitosDeTres(num) ) {
                result = result.concat("Fizz");
                contador++;
            } if (num % 5 == 0  || contieneDigitosDeCinco(num)) {
                result = result.concat("Buzz");
                contador++;
            }
            System.out.println("Num :" +  num + " : " + result);
            num++;
            result = "";
        }
    }
    
    public static boolean  contieneDigitosDeTres(int num) {
        String numStr = Integer.toString(num);
        if(numStr.contains("3")) {
            return true;
        }
        return false;
    }
    public static boolean  contieneDigitosDeCinco(int num) {
        String numStr = Integer.toString(num);
        if (numStr.contains("5")){
            return true;
        }
        return false;
    }
}