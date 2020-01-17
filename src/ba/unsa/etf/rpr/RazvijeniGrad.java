package ba.unsa.etf.rpr;

public class RazvijeniGrad extends Grad {
    private int brojBolnica;

    public RazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public RazvijeniGrad() {
    }

    public int getBrojBolnica() {
        return brojBolnica;
    }

    public void setBrojBolnica(int brojBolnica) {
        this.brojBolnica = brojBolnica;
    }

    int brojBolnica(){
        if(getBrojStanovnika()%10000 != 0)
            return getBrojStanovnika()/10000 + 1;
        else
            return getBrojStanovnika()/10000;
    }

}
