package xxgam.oracle.apps.xbol.tm.extracost.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TotalsVORowImpl extends OAViewRowImpl {
    public static final int IDTOTAL = 0;
    public static final int IDFREIGHTCHAR = 1;
    public static final int COSTFREIGHT = 2;
    public static final int COSTTAXESFREIGHT = 3;
    public static final int COSTMANEUVERS = 4;
    public static final int COSTTAXESMANEUVERS = 5;
    public static final int COSTADD = 6;
    public static final int COSTTAXESADD = 7;
    public static final int RETENTIONCOST = 8;
    public static final int NETTOTAL = 9;
    public static final int TAXESTOTAL = 10;
    public static final int TOTAL = 11;
    public static final int CURRENCY = 12;
    public static final int ATTRIBUTE1 = 13;
    public static final int ATTRIBUTE2 = 14;
    public static final int ATTRIBUTE3 = 15;
    public static final int ATTRIBUTE4 = 16;
    public static final int ATTRIBUTE5 = 17;
    public static final int ATTRIBUTE6 = 18;
    public static final int ATTRIBUTE7 = 19;
    public static final int ATTRIBUTE8 = 20;
    public static final int ATTRIBUTE9 = 21;
    public static final int ATTRIBUTE10 = 22;
    public static final int ATTRIBUTE11 = 23;
    public static final int ATTRIBUTE12 = 24;
    public static final int ATTRIBUTE13 = 25;
    public static final int ATTRIBUTE14 = 26;
    public static final int ATTRIBUTE15 = 27;
    public static final int CREATEDBY = 28;
    public static final int CREATIONDATE = 29;
    public static final int LASTUPDATEDBY = 30;
    public static final int LASTUPDATEDATE = 31;
    public static final int LASTUPDATELOGIN = 32;

    /**This is the default constructor (do not remove)
     */
    public TotalsVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute IdTotal
     */
    public Number getIdTotal() {
        return (Number) getAttributeInternal(IDTOTAL);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdTotal
     */
    public void setIdTotal(Number value) {
        setAttributeInternal(IDTOTAL, value);
    }

    /**Gets the attribute value for the calculated attribute IdFreightChar
     */
    public String getIdFreightChar() {
        return (String) getAttributeInternal(IDFREIGHTCHAR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdFreightChar
     */
    public void setIdFreightChar(String value) {
        setAttributeInternal(IDFREIGHTCHAR, value);
    }

    /**Gets the attribute value for the calculated attribute CostFreight
     */
    public Number getCostFreight() {
        return (Number) getAttributeInternal(COSTFREIGHT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostFreight
     */
    public void setCostFreight(Number value) {
        setAttributeInternal(COSTFREIGHT, value);
    }

    /**Gets the attribute value for the calculated attribute CostTaxesFreight
     */
    public Number getCostTaxesFreight() {
        return (Number) getAttributeInternal(COSTTAXESFREIGHT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostTaxesFreight
     */
    public void setCostTaxesFreight(Number value) {
        setAttributeInternal(COSTTAXESFREIGHT, value);
    }

    /**Gets the attribute value for the calculated attribute CostManeuvers
     */
    public Number getCostManeuvers() {
        return (Number) getAttributeInternal(COSTMANEUVERS);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostManeuvers
     */
    public void setCostManeuvers(Number value) {
        setAttributeInternal(COSTMANEUVERS, value);
    }

    /**Gets the attribute value for the calculated attribute CostTaxesManeuvers
     */
    public Number getCostTaxesManeuvers() {
        return (Number) getAttributeInternal(COSTTAXESMANEUVERS);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostTaxesManeuvers
     */
    public void setCostTaxesManeuvers(Number value) {
        setAttributeInternal(COSTTAXESMANEUVERS, value);
    }

    /**Gets the attribute value for the calculated attribute CostAdd
     */
    public Number getCostAdd() {
        return (Number) getAttributeInternal(COSTADD);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostAdd
     */
    public void setCostAdd(Number value) {
        setAttributeInternal(COSTADD, value);
    }

    /**Gets the attribute value for the calculated attribute CostTaxesAdd
     */
    public Number getCostTaxesAdd() {
        return (Number) getAttributeInternal(COSTTAXESADD);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CostTaxesAdd
     */
    public void setCostTaxesAdd(Number value) {
        setAttributeInternal(COSTTAXESADD, value);
    }

    /**Gets the attribute value for the calculated attribute RetentionCost
     */
    public Number getRetentionCost() {
        return (Number) getAttributeInternal(RETENTIONCOST);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute RetentionCost
     */
    public void setRetentionCost(Number value) {
        setAttributeInternal(RETENTIONCOST, value);
    }

    /**Gets the attribute value for the calculated attribute NetTotal
     */
    public Number getNetTotal() {
        return (Number) getAttributeInternal(NETTOTAL);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute NetTotal
     */
    public void setNetTotal(Number value) {
        setAttributeInternal(NETTOTAL, value);
    }

    /**Gets the attribute value for the calculated attribute TaxesTotal
     */
    public Number getTaxesTotal() {
        return (Number) getAttributeInternal(TAXESTOTAL);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute TaxesTotal
     */
    public void setTaxesTotal(Number value) {
        setAttributeInternal(TAXESTOTAL, value);
    }

    /**Gets the attribute value for the calculated attribute Total
     */
    public Number getTotal() {
        return (Number) getAttributeInternal(TOTAL);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Total
     */
    public void setTotal(Number value) {
        setAttributeInternal(TOTAL, value);
    }

    /**Gets the attribute value for the calculated attribute Currency
     */
    public String getCurrency() {
        return (String) getAttributeInternal(CURRENCY);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Currency
     */
    public void setCurrency(String value) {
        setAttributeInternal(CURRENCY, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute1
     */
    public Number getAttribute1() {
        return (Number) getAttributeInternal(ATTRIBUTE1);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute1
     */
    public void setAttribute1(Number value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute2
     */
    public Number getAttribute2() {
        return (Number) getAttributeInternal(ATTRIBUTE2);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute2
     */
    public void setAttribute2(Number value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute3
     */
    public Number getAttribute3() {
        return (Number) getAttributeInternal(ATTRIBUTE3);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute3
     */
    public void setAttribute3(Number value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute4
     */
    public Number getAttribute4() {
        return (Number) getAttributeInternal(ATTRIBUTE4);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute4
     */
    public void setAttribute4(Number value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute5
     */
    public Number getAttribute5() {
        return (Number) getAttributeInternal(ATTRIBUTE5);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute5
     */
    public void setAttribute5(Number value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute6
     */
    public Number getAttribute6() {
        return (Number) getAttributeInternal(ATTRIBUTE6);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute6
     */
    public void setAttribute6(Number value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute7
     */
    public Number getAttribute7() {
        return (Number) getAttributeInternal(ATTRIBUTE7);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute7
     */
    public void setAttribute7(Number value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute8
     */
    public Number getAttribute8() {
        return (Number) getAttributeInternal(ATTRIBUTE8);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute8
     */
    public void setAttribute8(Number value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute9
     */
    public Number getAttribute9() {
        return (Number) getAttributeInternal(ATTRIBUTE9);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute9
     */
    public void setAttribute9(Number value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute10
     */
    public Number getAttribute10() {
        return (Number) getAttributeInternal(ATTRIBUTE10);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute10
     */
    public void setAttribute10(Number value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute11
     */
    public String getAttribute11() {
        return (String) getAttributeInternal(ATTRIBUTE11);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute11
     */
    public void setAttribute11(String value) {
        setAttributeInternal(ATTRIBUTE11, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute12
     */
    public String getAttribute12() {
        return (String) getAttributeInternal(ATTRIBUTE12);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute12
     */
    public void setAttribute12(String value) {
        setAttributeInternal(ATTRIBUTE12, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute13
     */
    public String getAttribute13() {
        return (String) getAttributeInternal(ATTRIBUTE13);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute13
     */
    public void setAttribute13(String value) {
        setAttributeInternal(ATTRIBUTE13, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute14
     */
    public String getAttribute14() {
        return (String) getAttributeInternal(ATTRIBUTE14);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute14
     */
    public void setAttribute14(String value) {
        setAttributeInternal(ATTRIBUTE14, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute15
     */
    public String getAttribute15() {
        return (String) getAttributeInternal(ATTRIBUTE15);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute15
     */
    public void setAttribute15(String value) {
        setAttributeInternal(ATTRIBUTE15, value);
    }

    /**Gets the attribute value for the calculated attribute CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**Gets the attribute value for the calculated attribute CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**Gets the attribute value for the calculated attribute LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**Gets the attribute value for the calculated attribute LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**Gets the attribute value for the calculated attribute LastUpdateLogin
     */
    public Number getLastUpdateLogin() {
        return (Number) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute LastUpdateLogin
     */
    public void setLastUpdateLogin(Number value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case IDTOTAL:
            return getIdTotal();
        case IDFREIGHTCHAR:
            return getIdFreightChar();
        case COSTFREIGHT:
            return getCostFreight();
        case COSTTAXESFREIGHT:
            return getCostTaxesFreight();
        case COSTMANEUVERS:
            return getCostManeuvers();
        case COSTTAXESMANEUVERS:
            return getCostTaxesManeuvers();
        case COSTADD:
            return getCostAdd();
        case COSTTAXESADD:
            return getCostTaxesAdd();
        case RETENTIONCOST:
            return getRetentionCost();
        case NETTOTAL:
            return getNetTotal();
        case TAXESTOTAL:
            return getTaxesTotal();
        case TOTAL:
            return getTotal();
        case CURRENCY:
            return getCurrency();
        case ATTRIBUTE1:
            return getAttribute1();
        case ATTRIBUTE2:
            return getAttribute2();
        case ATTRIBUTE3:
            return getAttribute3();
        case ATTRIBUTE4:
            return getAttribute4();
        case ATTRIBUTE5:
            return getAttribute5();
        case ATTRIBUTE6:
            return getAttribute6();
        case ATTRIBUTE7:
            return getAttribute7();
        case ATTRIBUTE8:
            return getAttribute8();
        case ATTRIBUTE9:
            return getAttribute9();
        case ATTRIBUTE10:
            return getAttribute10();
        case ATTRIBUTE11:
            return getAttribute11();
        case ATTRIBUTE12:
            return getAttribute12();
        case ATTRIBUTE13:
            return getAttribute13();
        case ATTRIBUTE14:
            return getAttribute14();
        case ATTRIBUTE15:
            return getAttribute15();
        case CREATEDBY:
            return getCreatedBy();
        case CREATIONDATE:
            return getCreationDate();
        case LASTUPDATEDBY:
            return getLastUpdatedBy();
        case LASTUPDATEDATE:
            return getLastUpdateDate();
        case LASTUPDATELOGIN:
            return getLastUpdateLogin();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}