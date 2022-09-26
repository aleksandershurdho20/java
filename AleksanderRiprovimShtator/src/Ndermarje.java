

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D05BAA62-15B2-42AA-C99F-6E7206E1A306]
// </editor-fold> 
public class Ndermarje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2A16F923-46C0-05EB-E401-9935AF054393]
    // </editor-fold> 
    private double teArdhurat;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.686E0256-029F-610F-BC6C-9C1543ACE1A3]
    // </editor-fold> 

    private String name;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C672159D-B6AD-D8ED-8E0B-4440A686AF0D]
    // </editor-fold> 
    public Ndermarje (String ndName, double income ) {
        name = ndName;
        teArdhurat = income;
   
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B3009C70-4EEA-050F-3242-C6EA78A9E4BA]
    // </editor-fold> 
    public String getName () {
        return name;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BD46982F-B798-FD4C-C9DA-91320FDE3912]
    // </editor-fold> 
    public void setName (String val) {
        this.name = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8BD7021D-2EF0-E233-A8BA-154F589DABEF]
    // </editor-fold> 
    public double getTeArdhurat () {
        return teArdhurat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B23AB31-0623-7274-2C49-4B2603D25A3D]
    // </editor-fold> 
    public void setTeArdhurat (int val) {
        this.teArdhurat = val;
    }

}

