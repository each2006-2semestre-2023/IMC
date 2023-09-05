package br.usp.each.ericksonlbs.imc;

public class App 
{
    public static void main( String[] args )
    {
        int myIMC = IMC.Calc(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        System.out.println( "Your IMC is: " + (String.valueOf(myIMC)));
    }
}
