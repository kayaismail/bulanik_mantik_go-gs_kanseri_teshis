/*
 * Breast issue data setinde göğüs tümörlerinin türlerine göre Electrical Impedance Spectroscopy
değerleri bulunmaktadır datanın 9 tane farklı değişkeni 6 farklı tümör tipi bulunmaktadır ancak ben 2 tane değişkeni 
kullandım ve tümör tipi olarakta Kanser olanı 1 diğerlerini kanser değil ve 0 olarak kabul ettim.
2 girdi değişkeni ve 1 çıktı değişkeni şeklinde.
 */
package Bulanikodev;

import java.io.File;
import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;


/**
 *
 * @author ismailkaya
 */
public class Kanser {
    
    public double pa500;
    public double DA;
    public FIS fis;
    
        public Kanser(double pa500, double DA) throws URISyntaxException{
            this.pa500 = pa500;
            this.DA = DA;
            
            File dosya = new File(getClass().getResource("model2.fcl").toURI());
            fis = FIS.load(dosya.getPath(),true);
            fis.setVariable("pa500",pa500);
            fis.setVariable("DA", DA);
            fis.evaluate();
        }
        
        @Override
        public String toString(){
            String cikti = "ys: "+fis.getVariable("tumor_tipi").getValue();
            return cikti;
        }
     public FIS getModel() {
        return fis;
    } 
}
