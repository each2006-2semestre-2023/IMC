package br.usp.each.ericksonlbs.imc;

/**
 * A very simple code used as motivational example
 *
 */
public class IMC
{
    public static int Calc(double weight, double height)
    {        
        double imc;
        int level;
        imc = weight/(height*height);
        if (imc < 18.5)
        {
            level = 0;
        }
        else if (imc < 25)
        {
            level = 1;
        }
        else if (imc < 30)
        {
            level = 2;
        }
        else if (imc < 35)
        {
            level = 3;
        }
        else if (imc > 40)
        {
            level = 4;
        }
        else 
        {
            level = 5;
        }
        return level;
    }
}