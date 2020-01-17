package ba.unsa.etf.rpr;

public class SrednjeRazvijeniGrad extends Grad {
    private int brojBolnica;
    public SrednjeRazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public SrednjeRazvijeniGrad() {
    }

    public int getBrojBolnica() {
        return brojBolnica;
    }

    public void setBrojBolnica(int brojBolnica) {
        this.brojBolnica = brojBolnica;
    }

    int brojBolnica(){
        if(getBrojStanovnika()%25000 != 0)
            return getBrojStanovnika()/25000 + 1;
        else
        return getBrojStanovnika()/25000;

    }
}
