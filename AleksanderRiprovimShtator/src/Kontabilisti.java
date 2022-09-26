
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.55CCE26D-D61B-76CB-E97F-B55A96727A44]
// </editor-fold> 
public class Kontabilisti {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CB3CB893-7EE4-56A5-21CC-26ED02E78566]
    // </editor-fold> 
    private ITax mITax;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.807E2601-6BDC-15C9-5737-BA19FAA583CD]
    // </editor-fold> 
    public Kontabilisti () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B9A5DF0-88EA-E6EF-2EC6-C1E7938920B0]
    // </editor-fold> 
    public ITax getITax () {
        return mITax;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D462A401-E1AE-6593-5189-4584C8D33A72]
    // </editor-fold> 
    public void setITax (ITax val) {
        this.mITax = val;
    }
    public static void main(String[] args) {
        
     int taxCode = 1;
     double teArdhurat = 3200000.00; 
    Kontabilisti cont = new Kontabilisti();
    Ndermarje nd = new Ndermarje("BigMarket", teArdhurat);

      
     
        if(taxCode == 1){
        System.out.println("Kontabilisti llogarit taksen e sheshte");
        cont.setITax(new StandartTax());
       double staxresult = cont.getITax().calculateTax(teArdhurat);
        System.out.println("Rezultati final i perllogaritjes se takses sheshte eshte " +staxresult);

        }
        else if (taxCode == 0){
        
        System.out.println("Kontabilisti llogarit taksen progressive");
    cont.setITax(new ProgressiveTax());
       double ptaxresult = cont.getITax().calculateTax(teArdhurat);
       
        System.out.println("Rezultati final i perllogaritjes se takses progressive eshte " +ptaxresult);
        
        }
        
       
       
        
        
         
    }
}

