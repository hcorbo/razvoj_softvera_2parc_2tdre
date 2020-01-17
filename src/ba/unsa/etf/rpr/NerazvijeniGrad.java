package ba.unsa.etf.rpr;

public class NerazvijeniGrad extends Grad {
    private int brojBolnica;

    public NerazvijeniGrad(int id, String naziv, int brojStanovnika, Drzava drzava) {
        super(id, naziv, brojStanovnika, drzava);
    }

    public NerazvijeniGrad() {
    }

    public int getBrojBolnica() {
        return brojBolnica;
    }

    public void setBrojBolnica(int brojBolnica) {
        this.brojBolnica = brojBolnica;
    }

    @Override
    int brojBolnica(){
        if(getBrojStanovnika()%10000 != 0)
            return getBrojStanovnika()/100000 + 1;
        else
            return getBrojStanovnika()/100000;
    }
}
