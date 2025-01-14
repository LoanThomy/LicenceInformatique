package ex1_Zoo;

import java.util.ArrayList;

/**
 *
 * @author loant
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cptReptiles = 0;
        int cptTerrestre = 0;
        
        ArrayList<Animal> animaux = new ArrayList<>();
        
        MammifereAquatique ma = new MammifereAquatique(false, true,"Baleine");
        MammifereTerrestre mt = new MammifereTerrestre("plaine",false,"cheval");
        ReptileAquatique ra = new ReptileAquatique(true, true, "Vipère");
        ReptileTerrestre rt = new ReptileTerrestre("terre", true, "Vipère");

        animaux.add(ma);
        animaux.add(mt);
        animaux.add(ra);
        animaux.add(rt);
        
        for (Animal a : animaux){
            if (a instanceof ReptileAquatique || a instanceof ReptileTerrestre){
                cptReptiles++;
            }
            if (a instanceof MammifereTerrestre || a instanceof ReptileTerrestre){
                cptTerrestre++;
            } 
        }
        
        System.out.println("cptReptiles : " + cptReptiles);
        System.out.println("cptTerrestre : " + cptTerrestre);
    }
    
}
