package erpsolscm.erpsolscmmodel.erpsolscmvo;

import erpsolscm.erpsolscmmodel.erpsolscmvo.common.SoSalesOrderImeiView;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 02 23:54:40 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SoSalesOrderImeiViewImpl extends ViewObjectImpl implements SoSalesOrderImeiView {
    /**
     * This is the default constructor (do not remove).
     */
    public SoSalesOrderImeiViewImpl() {
    }    
    public void doERPSolRemoveBox() {
        String ERPSolBox=this.getCurrentRow().getAttribute("TempBoxNo").toString();
        this.setRangeSize(-1);
        
        for (int i = 0; i < this.getViewObject().getEstimatedRowCount(); i++) {
            if (getRowAtRangeIndex(i).getAttribute("TempBoxNo").toString().equals(ERPSolBox)) {
               getRowAtRangeIndex(i).remove();
               i--;
           }
       }

    }
}

