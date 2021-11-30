package erpsolscm.erpsolscmmodel.erpsolscmeo;

import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobClassModel;
import erpsolglob.erpsolglobmodel.erpsolglobclasses.ERPSolGlobalsEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Nov 28 01:07:48 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SoRebateImpl extends ERPSolGlobalsEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        RebateId,
        Locationid,
        Rdate,
        Posted,
        Postedby,
        Createdby,
        CreatedDate,
        Modifiedby,
        ModifiedDate,
        Customerid,
        Storeid,
        Remarks,
        Pid,
        Salespersonid,
        ManualRefNo,
        LocCurrcode,
        ExchangeRate,
        IsSameRate,
        EbsCustomerId,
        EbsLocationId,
        EbsStoreId,
        EbsSalespersonId,
        Catid,
        Invoiceid,
        Rebateseq,
        Supplierid,
        ConsignmentNo,
        txtSupplierName,
        txtStoreName,
        txtSalesPersonName,
        txtCustomerName,
        SoRebateDetail,
        SoRebateImei,
        AllCustomers,
        SoSalesPersons,
        AllStores,
        PuSuppliers;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int REBATEID = AttributesEnum.RebateId.index();
    public static final int LOCATIONID = AttributesEnum.Locationid.index();
    public static final int RDATE = AttributesEnum.Rdate.index();
    public static final int POSTED = AttributesEnum.Posted.index();
    public static final int POSTEDBY = AttributesEnum.Postedby.index();
    public static final int CREATEDBY = AttributesEnum.Createdby.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int MODIFIEDBY = AttributesEnum.Modifiedby.index();
    public static final int MODIFIEDDATE = AttributesEnum.ModifiedDate.index();
    public static final int CUSTOMERID = AttributesEnum.Customerid.index();
    public static final int STOREID = AttributesEnum.Storeid.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int PID = AttributesEnum.Pid.index();
    public static final int SALESPERSONID = AttributesEnum.Salespersonid.index();
    public static final int MANUALREFNO = AttributesEnum.ManualRefNo.index();
    public static final int LOCCURRCODE = AttributesEnum.LocCurrcode.index();
    public static final int EXCHANGERATE = AttributesEnum.ExchangeRate.index();
    public static final int ISSAMERATE = AttributesEnum.IsSameRate.index();
    public static final int EBSCUSTOMERID = AttributesEnum.EbsCustomerId.index();
    public static final int EBSLOCATIONID = AttributesEnum.EbsLocationId.index();
    public static final int EBSSTOREID = AttributesEnum.EbsStoreId.index();
    public static final int EBSSALESPERSONID = AttributesEnum.EbsSalespersonId.index();
    public static final int CATID = AttributesEnum.Catid.index();
    public static final int INVOICEID = AttributesEnum.Invoiceid.index();
    public static final int REBATESEQ = AttributesEnum.Rebateseq.index();
    public static final int SUPPLIERID = AttributesEnum.Supplierid.index();
    public static final int CONSIGNMENTNO = AttributesEnum.ConsignmentNo.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int TXTSTORENAME = AttributesEnum.txtStoreName.index();
    public static final int TXTSALESPERSONNAME = AttributesEnum.txtSalesPersonName.index();
    public static final int TXTCUSTOMERNAME = AttributesEnum.txtCustomerName.index();
    public static final int SOREBATEDETAIL = AttributesEnum.SoRebateDetail.index();
    public static final int SOREBATEIMEI = AttributesEnum.SoRebateImei.index();
    public static final int ALLCUSTOMERS = AttributesEnum.AllCustomers.index();
    public static final int SOSALESPERSONS = AttributesEnum.SoSalesPersons.index();
    public static final int ALLSTORES = AttributesEnum.AllStores.index();
    public static final int PUSUPPLIERS = AttributesEnum.PuSuppliers.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SoRebateImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpsolscm.erpsolscmmodel.erpsolscmeo.SoRebate");
    }


    /**
     * Gets the attribute value for RebateId, using the alias name RebateId.
     * @return the value of RebateId
     */
    public String getRebateId() {
        return (String) getAttributeInternal(REBATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RebateId.
     * @param value value to set the RebateId
     */
    public void setRebateId(String value) {
        setAttributeInternal(REBATEID, value);
    }

    /**
     * Gets the attribute value for Locationid, using the alias name Locationid.
     * @return the value of Locationid
     */
    public String getLocationid() {
        return (String) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Locationid.
     * @param value value to set the Locationid
     */
    public void setLocationid(String value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for Rdate, using the alias name Rdate.
     * @return the value of Rdate
     */
    public Date getRdate() {
        return (Date) getAttributeInternal(RDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rdate.
     * @param value value to set the Rdate
     */
    public void setRdate(Date value) {
        setAttributeInternal(RDATE, value);
    }

    /**
     * Gets the attribute value for Posted, using the alias name Posted.
     * @return the value of Posted
     */
    public String getPosted() {
        return (String) getAttributeInternal(POSTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Posted.
     * @param value value to set the Posted
     */
    public void setPosted(String value) {
        setAttributeInternal(POSTED, value);
    }

    /**
     * Gets the attribute value for Postedby, using the alias name Postedby.
     * @return the value of Postedby
     */
    public String getPostedby() {
        return (String) getAttributeInternal(POSTEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Postedby.
     * @param value value to set the Postedby
     */
    public void setPostedby(String value) {
        setAttributeInternal(POSTEDBY, value);
    }

    /**
     * Gets the attribute value for Createdby, using the alias name Createdby.
     * @return the value of Createdby
     */
    public String getCreatedby() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Createdby.
     * @param value value to set the Createdby
     */
    public void setCreatedby(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for Modifiedby, using the alias name Modifiedby.
     * @return the value of Modifiedby
     */
    public String getModifiedby() {
        return (String) getAttributeInternal(MODIFIEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Modifiedby.
     * @param value value to set the Modifiedby
     */
    public void setModifiedby(String value) {
        setAttributeInternal(MODIFIEDBY, value);
    }

    /**
     * Gets the attribute value for ModifiedDate, using the alias name ModifiedDate.
     * @return the value of ModifiedDate
     */
    public Date getModifiedDate() {
        return (Date) getAttributeInternal(MODIFIEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ModifiedDate.
     * @param value value to set the ModifiedDate
     */
    public void setModifiedDate(Date value) {
        setAttributeInternal(MODIFIEDDATE, value);
    }

    /**
     * Gets the attribute value for Customerid, using the alias name Customerid.
     * @return the value of Customerid
     */
    public String getCustomerid() {
        return (String) getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Customerid.
     * @param value value to set the Customerid
     */
    public void setCustomerid(String value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for Storeid, using the alias name Storeid.
     * @return the value of Storeid
     */
    public String getStoreid() {
        return (String) getAttributeInternal(STOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Storeid.
     * @param value value to set the Storeid
     */
    public void setStoreid(String value) {
        setAttributeInternal(STOREID, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for Pid, using the alias name Pid.
     * @return the value of Pid
     */
    public Integer getPid() {
        return (Integer) getAttributeInternal(PID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Pid.
     * @param value value to set the Pid
     */
    public void setPid(Integer value) {
        setAttributeInternal(PID, value);
    }

    /**
     * Gets the attribute value for Salespersonid, using the alias name Salespersonid.
     * @return the value of Salespersonid
     */
    public String getSalespersonid() {
        return (String) getAttributeInternal(SALESPERSONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Salespersonid.
     * @param value value to set the Salespersonid
     */
    public void setSalespersonid(String value) {
        setAttributeInternal(SALESPERSONID, value);
    }

    /**
     * Gets the attribute value for ManualRefNo, using the alias name ManualRefNo.
     * @return the value of ManualRefNo
     */
    public String getManualRefNo() {
        return (String) getAttributeInternal(MANUALREFNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManualRefNo.
     * @param value value to set the ManualRefNo
     */
    public void setManualRefNo(String value) {
        setAttributeInternal(MANUALREFNO, value);
    }

    /**
     * Gets the attribute value for LocCurrcode, using the alias name LocCurrcode.
     * @return the value of LocCurrcode
     */
    public String getLocCurrcode() {
        return (String) getAttributeInternal(LOCCURRCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocCurrcode.
     * @param value value to set the LocCurrcode
     */
    public void setLocCurrcode(String value) {
        setAttributeInternal(LOCCURRCODE, value);
    }

    /**
     * Gets the attribute value for ExchangeRate, using the alias name ExchangeRate.
     * @return the value of ExchangeRate
     */
    public BigDecimal getExchangeRate() {
        return (BigDecimal) getAttributeInternal(EXCHANGERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ExchangeRate.
     * @param value value to set the ExchangeRate
     */
    public void setExchangeRate(BigDecimal value) {
        setAttributeInternal(EXCHANGERATE, value);
    }

    /**
     * Gets the attribute value for IsSameRate, using the alias name IsSameRate.
     * @return the value of IsSameRate
     */
    public String getIsSameRate() {
        return (String) getAttributeInternal(ISSAMERATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsSameRate.
     * @param value value to set the IsSameRate
     */
    public void setIsSameRate(String value) {
        setAttributeInternal(ISSAMERATE, value);
    }

    /**
     * Gets the attribute value for EbsCustomerId, using the alias name EbsCustomerId.
     * @return the value of EbsCustomerId
     */
    public String getEbsCustomerId() {
        return (String) getAttributeInternal(EBSCUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EbsCustomerId.
     * @param value value to set the EbsCustomerId
     */
    public void setEbsCustomerId(String value) {
        setAttributeInternal(EBSCUSTOMERID, value);
    }

    /**
     * Gets the attribute value for EbsLocationId, using the alias name EbsLocationId.
     * @return the value of EbsLocationId
     */
    public String getEbsLocationId() {
        return (String) getAttributeInternal(EBSLOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EbsLocationId.
     * @param value value to set the EbsLocationId
     */
    public void setEbsLocationId(String value) {
        setAttributeInternal(EBSLOCATIONID, value);
    }

    /**
     * Gets the attribute value for EbsStoreId, using the alias name EbsStoreId.
     * @return the value of EbsStoreId
     */
    public String getEbsStoreId() {
        return (String) getAttributeInternal(EBSSTOREID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EbsStoreId.
     * @param value value to set the EbsStoreId
     */
    public void setEbsStoreId(String value) {
        setAttributeInternal(EBSSTOREID, value);
    }

    /**
     * Gets the attribute value for EbsSalespersonId, using the alias name EbsSalespersonId.
     * @return the value of EbsSalespersonId
     */
    public String getEbsSalespersonId() {
        return (String) getAttributeInternal(EBSSALESPERSONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EbsSalespersonId.
     * @param value value to set the EbsSalespersonId
     */
    public void setEbsSalespersonId(String value) {
        setAttributeInternal(EBSSALESPERSONID, value);
    }

    /**
     * Gets the attribute value for Catid, using the alias name Catid.
     * @return the value of Catid
     */
    public String getCatid() {
        return (String) getAttributeInternal(CATID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Catid.
     * @param value value to set the Catid
     */
    public void setCatid(String value) {
        setAttributeInternal(CATID, value);
    }

    /**
     * Gets the attribute value for Invoiceid, using the alias name Invoiceid.
     * @return the value of Invoiceid
     */
    public String getInvoiceid() {
        return (String) getAttributeInternal(INVOICEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Invoiceid.
     * @param value value to set the Invoiceid
     */
    public void setInvoiceid(String value) {
        setAttributeInternal(INVOICEID, value);
    }

    /**
     * Gets the attribute value for Rebateseq, using the alias name Rebateseq.
     * @return the value of Rebateseq
     */
    public Integer getRebateseq() {
        return (Integer) getAttributeInternal(REBATESEQ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rebateseq.
     * @param value value to set the Rebateseq
     */
    public void setRebateseq(Integer value) {
        setAttributeInternal(REBATESEQ, value);
    }

    /**
     * Gets the attribute value for Supplierid, using the alias name Supplierid.
     * @return the value of Supplierid
     */
    public String getSupplierid() {
        return (String) getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Supplierid.
     * @param value value to set the Supplierid
     */
    public void setSupplierid(String value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for ConsignmentNo, using the alias name ConsignmentNo.
     * @return the value of ConsignmentNo
     */
    public String getConsignmentNo() {
        return (String) getAttributeInternal(CONSIGNMENTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ConsignmentNo.
     * @param value value to set the ConsignmentNo
     */
    public void setConsignmentNo(String value) {
        setAttributeInternal(CONSIGNMENTNO, value);
    }

    /**
     * Gets the attribute value for txtSupplierName, using the alias name txtSupplierName.
     * @return the value of txtSupplierName
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSupplierName.
     * @param value value to set the txtSupplierName
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for txtStoreName, using the alias name txtStoreName.
     * @return the value of txtStoreName
     */
    public String gettxtStoreName() {
        return (String) getAttributeInternal(TXTSTORENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtStoreName.
     * @param value value to set the txtStoreName
     */
    public void settxtStoreName(String value) {
        setAttributeInternal(TXTSTORENAME, value);
    }

    /**
     * Gets the attribute value for txtSalesPersonName, using the alias name txtSalesPersonName.
     * @return the value of txtSalesPersonName
     */
    public String gettxtSalesPersonName() {
        return (String) getAttributeInternal(TXTSALESPERSONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSalesPersonName.
     * @param value value to set the txtSalesPersonName
     */
    public void settxtSalesPersonName(String value) {
        setAttributeInternal(TXTSALESPERSONNAME, value);
    }

    /**
     * Gets the attribute value for txtCustomerName, using the alias name txtCustomerName.
     * @return the value of txtCustomerName
     */
    public String gettxtCustomerName() {
        return (String) getAttributeInternal(TXTCUSTOMERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCustomerName.
     * @param value value to set the txtCustomerName
     */
    public void settxtCustomerName(String value) {
        setAttributeInternal(TXTCUSTOMERNAME, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSoRebateDetail() {
        return (RowIterator) getAttributeInternal(SOREBATEDETAIL);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getSoRebateImei() {
        return (RowIterator) getAttributeInternal(SOREBATEIMEI);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllCustomers() {
        return (EntityImpl) getAttributeInternal(ALLCUSTOMERS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllCustomers(EntityImpl value) {
        setAttributeInternal(ALLCUSTOMERS, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getSoSalesPersons() {
        return (EntityImpl) getAttributeInternal(SOSALESPERSONS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setSoSalesPersons(EntityImpl value) {
        setAttributeInternal(SOSALESPERSONS, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAllStores() {
        return (EntityImpl) getAttributeInternal(ALLSTORES);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAllStores(EntityImpl value) {
        setAttributeInternal(ALLSTORES, value);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getPuSuppliers() {
        return (EntityImpl) getAttributeInternal(PUSUPPLIERS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPuSuppliers(EntityImpl value) {
        setAttributeInternal(PUSUPPLIERS, value);
    }


    /**
     * @param rebateseq key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer rebateseq) {
        return new Key(new Object[] { rebateseq });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
  
        setERPSolPKColumnName("Rebateseq");
        setERPSolPKSeqName("so_rebate_seq");
        setLocationid(ERPSolGlobClassModel.doGetUserLocationCode());
        setStoreid(ERPSolGlobClassModel.doGetUserStoreCode());
//        setCompanyid(ERPSolGlobClassModel.doGetUserCompanyCode());      
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
            if (operation==DML_INSERT) {
                String pkValue=" salesrebate_id('"+ERPSolGlobClassModel.doGetUserCompanyCode()+"','"+ERPSolGlobClassModel.doGetUserLocationCode()+"',TO_DATE('"+getRdate()+"','YYYY-MM-DD'))";
                String result= ERPSolGlobClassModel.doGetERPSolPrimaryKeyValueModel(getDBTransaction(), pkValue, "dual", null, null);
                populateAttributeAsChanged(REBATEID, result);
            }
        super.doDML(operation, e);
    }
}
