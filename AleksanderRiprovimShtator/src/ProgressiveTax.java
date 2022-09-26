
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D3D87932-61A4-97A5-50C5-503008FD43CC]
// </editor-fold> 
public class ProgressiveTax implements ITax {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8498F26A-F761-0C59-F616-21A72767A645]
    // </editor-fold> 
    public ProgressiveTax () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AB3AA5E7-9C70-1199-EACA-ACAF49AD2F31]
    // </editor-fold> 
    @Override
    public double calculateTax (double teArdhurat) {
        double finalTax =0.00;
             if (teArdhurat <= 3000000) 
                     finalTax = teArdhurat * 0.15;
                else 
                    finalTax = teArdhurat * 0.23;
        
            return finalTax;
    }

}

