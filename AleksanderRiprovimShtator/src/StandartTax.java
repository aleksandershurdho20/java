
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.24D207D4-40F7-D762-694F-B71763C4DF79]
// </editor-fold> 
public class StandartTax implements ITax {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8C8AEC77-AF5E-0413-00D3-23BD967D6C36]
    // </editor-fold> 
    public StandartTax () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.26AC0D33-9A24-EACA-45D1-991A07DDB31B]
    // </editor-fold> 
    @Override
    public double calculateTax (double teArdhurat) {
        double finalTax = 0.00;
        finalTax = teArdhurat * 0.10;

        return finalTax;
    }

}

