package bulanikodev;

/*
 * Breast issue data setinde göğüs tümörlerinin türlerine göre Electrical Impedance Spectroscopy
değerleri bulunmaktadır datanın 9 tane farklı değişkeni 6 farklı tümör tipi bulunmaktadır ancak ben 2 tane değişkeni 
kullandım ve tümör tipi olarakta Kanser olanı 1 diğerlerini kanser değil ve 0 olarak kabul ettim.
2 girdi değişkeni ve 1 çıktı değişkeni şeklinde.
 */
import Bulanikodev.Kanser;
import java.net.URISyntaxException;
import java.util.Scanner;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;




/**
 *
 * @author ismail
 */
public class Bulanikodev
{

    /**
     * @param args the command line arguments
     * @throws java.net.URISyntaxException
     */
    public static void main(String[] args) throws URISyntaxException {
        
        Scanner in = new Scanner(System.in);
        System.out.print("pa500 (0,12000000-0,3599999):");
        double pa500 = in.nextDouble();
        System.out.print("DA (19-1000):");
        double DA = in.nextDouble();
        Kanser  r = new Kanser(pa500,DA);
        System.out.println(r);
        JFuzzyChart.get().chart(r.getModel());
    }
    
}
