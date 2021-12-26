package erpsolscm.erpsolscmmodel.erpsolscmvo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;

import erpsolscm.erpsolscmmodel.erpsolscmvo.common.SoSalesOrderView;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Nov 22 22:32:48 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SoSalesOrderViewImpl extends ViewObjectImpl implements SoSalesOrderView {
    /**
     * This is the default constructor (do not remove).
     */
    public SoSalesOrderViewImpl() {
    }
 
    public void doSuperviseSaleOrder() {
        
        CallableStatement cs=this.getDBTransaction().createCallableStatement("begin ?:=PKG_SALE_ORDER.FUNC_SUBMIT_SALES_ORDER('"+this.getCurrentRow().getAttribute("Salesorderid")+"','"+ERPSolGlobClassModel.doGetUserCode()+"'); END;", 1);
        System.out.println("begin ?:=PKG_SALE_ORDER.FUNC_SUBMIT_SALES_ORDER('"+this.getCurrentRow().getAttribute("Salesorderid")+"','"+ERPSolGlobClassModel.doGetUserCode()+"'); END;");
        try {
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.executeUpdate();
            this.getCurrentRow().refresh(Row.REFRESH_WITH_DB_FORGET_CHANGES);
            
            if (!cs.getString(1).equals("ERPSOLSUCCESS")) {
//               this.getCurrentRow().setAttribute("Posted", "N");
               this.getDBTransaction().commit();
                throw new JboException("Unable to supervise due to "+cs.getString(1));
               
           }
            this.getCurrentRow().setAttribute("Posted", "Y");
            this.getDBTransaction().commit();
        } catch (SQLException e) {
//            this.getCurrentRow().setAttribute("Posted", "N");
            this.getDBTransaction().commit();
            System.out.println(e.getMessage()+ "this is message");
            throw new JboException("Unable to supervise ");
        }
        finally{
            try {
                cs.close();
            } catch (SQLException e) {
            }
        }
    }

    public void doReadyForWarehouse() {
            this.getCurrentRow().setAttribute("ReadyForIssue", "Y");
            this.getDBTransaction().commit();
    }
    
   @Override
    public Row next() {
        // TODO Implement this method
       if (getApplicationModule().getTransaction().isDirty()) {
            throw new JboException("Please Save/Undo Changes First.");
       }
        return super.next();
    }
   
    @Override
     public Row previous() {
         // TODO Implement this method
        if (getApplicationModule().getTransaction().isDirty()) {
             throw new JboException("Please Save/Undo Changes First.");
        }
         return super.previous();
     }

    /**
     * Returns the variable value for P_ADF_USERID.
     * @return variable value for P_ADF_USERID
     */
    public String getP_ADF_USERID() {
        return (String) ensureVariableManager().getVariableValue("P_ADF_USERID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_USERID.
     * @param value value to bind as P_ADF_USERID
     */
    public void setP_ADF_USERID(String value) {
        ensureVariableManager().setVariableValue("P_ADF_USERID", value);
    }
}

