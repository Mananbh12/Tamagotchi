import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.GridLayout;
/**
 * Classe Etats
 * Firas Fares, Manan Bhardwaj, Dorian El Filiali, Hugo de la Reberdiere. 
 */
public class Etats extends Applet
{
    JProgressBar vit, fai, somm, hyg, toi, bon;
    /**
     * Constructeur d'objets de classe Etats
     */
    public Etats(Tamagotchi ta)
    {
        setLayout(new GridLayout(12,2));
        
        JLabel v = new JLabel("Vitalité");
        vit=new JProgressBar(0,100);
        vit.setValue(ta.getVie());
        JLabel vitLab=new JLabel(ta.getVie()+"%");
        
        JLabel f = new JLabel("Faim");
        fai=new JProgressBar(0,100);
        fai.setValue(ta.getFaim());
        JLabel faiLab=new JLabel(ta.getFaim()+"%");
        
        JLabel s = new JLabel("Sommeil");
        somm=new JProgressBar(0,100);
        somm.setValue(ta.getSommeil());
        JLabel sommLab=new JLabel(ta.getSommeil()+"%");
        
        JLabel h = new JLabel("Hygiène");
        hyg=new JProgressBar(0,100);
        hyg.setValue(ta.getHygene());
        JLabel hygLab=new JLabel(ta.getHygene()+"%");
        
        JLabel t = new JLabel("Toilette");
        toi=new JProgressBar(0,100);
        toi.setValue(ta.getToillete());
        JLabel toiLab=new JLabel(ta.getToillete()+"%");
        
        JLabel b = new JLabel("Bonheur");
        bon=new JProgressBar(0,100);
        bon.setValue(ta.getBonheur());
        JLabel bonLab=new JLabel(ta.getBonheur()+"%");
        
        add(v);add(new JLabel(":"));add(vit); add(vitLab);
        add(f);add(new JLabel(":"));add(fai); add(faiLab);
        add(s);add(new JLabel(":"));add(somm); add(sommLab);
        add(h);add(new JLabel(":"));add(hyg); add(hygLab);
        add(t);add(new JLabel(":"));add(toi); add(toiLab);
        add(b);add(new JLabel(":"));add(bon); add(bonLab);
    }
    
    public JProgressBar getVit(){
        return this.vit;
    }
    
    public JProgressBar getFai(){
       return this.fai;
    }
    
    public JProgressBar getSomm(){
       return this.somm;
    }
    
    public JProgressBar getHyg(){
       return this.hyg;
    }
    
    public JProgressBar getToi(){
       return this.toi;
    }
    
    public JProgressBar getBon(){
       return this.bon;
    }
    
}
