package xxgam.oracle.apps.xbol.tm.extracost.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.RowID;
import oracle.jbo.server.AttributeDefImpl;

import xxgam.oracle.apps.xbol.tm.extracost.schema.server.DetailEOImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DetailVORowImpl extends OAViewRowImpl {
    public static final int ATTRIBUTE1 = 0;
    public static final int ATTRIBUTE10 = 1;
    public static final int ATTRIBUTE11 = 2;
    public static final int ATTRIBUTE12 = 3;
    public static final int ATTRIBUTE13 = 4;
    public static final int ATTRIBUTE14 = 5;
    public static final int ATTRIBUTE15 = 6;
    public static final int ATTRIBUTE2 = 7;
    public static final int ATTRIBUTE3 = 8;
    public static final int ATTRIBUTE4 = 9;
    public static final int ATTRIBUTE5 = 10;
    public static final int ATTRIBUTE6 = 11;
    public static final int ATTRIBUTE7 = 12;
    public static final int ATTRIBUTE8 = 13;
    public static final int ATTRIBUTE9 = 14;
    public static final int CREATEDBY = 15;
    public static final int CREATIONDATE = 16;
    public static final int IDEXTRACOST = 17;
    public static final int IDFREIGHTCHAR = 18;
    public static final int LASTUPDATEDBY = 19;
    public static final int LASTUPDATEDATE = 20;
    public static final int LASTUPDATELOGIN = 21;
    public static final int RATE = 22;
    public static final int RETENTIONFLAG = 23;
    public static final int ROWID = 24;
    public static final int TAXRATE = 25;
    public static final int TYPEEXTRACOST = 26;

    /**This is the default constructor (do not remove)
     */
    public DetailVORowImpl() {
    }

    /**Gets DetailEO entity object.
     */
    public DetailEOImpl getDetailEO() {
        return (DetailEOImpl)getEntity(0);
    }

    /**Gets the attribute value for ATTRIBUTE1 using the alias name Attribute1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE1 using the alias name Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**Gets the attribute value for ATTRIBUTE10 using the alias name Attribute10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE10 using the alias name Attribute10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**Gets the attribute value for ATTRIBUTE11 using the alias name Attribute11
     */
    public String getAttribute11() {
        return (String) getAttributeInternal(ATTRIBUTE11);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE11 using the alias name Attribute11
     */
    public void setAttribute11(String value) {
        setAttributeInternal(ATTRIBUTE11, value);
    }

    /**Gets the attribute value for ATTRIBUTE12 using the alias name Attribute12
     */
    public String getAttribute12() {
        return (String) getAttributeInternal(ATTRIBUTE12);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE12 using the alias name Attribute12
     */
    public void setAttribute12(String value) {
        setAttributeInternal(ATTRIBUTE12, value);
    }

    /**Gets the attribute value for ATTRIBUTE13 using the alias name Attribute13
     */
    public String getAttribute13() {
        return (String) getAttributeInternal(ATTRIBUTE13);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE13 using the alias name Attribute13
     */
    public void setAttribute13(String value) {
        setAttributeInternal(ATTRIBUTE13, value);
    }

    /**Gets the attribute value for ATTRIBUTE14 using the alias name Attribute14
     */
    public String getAttribute14() {
        return (String) getAttributeInternal(ATTRIBUTE14);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE14 using the alias name Attribute14
     */
    public void setAttribute14(String value) {
        setAttributeInternal(ATTRIBUTE14, value);
    }

    /**Gets the attribute value for ATTRIBUTE15 using the alias name Attribute15
     */
    public String getAttribute15() {
        return (String) getAttributeInternal(ATTRIBUTE15);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE15 using the alias name Attribute15
     */
    public void setAttribute15(String value) {
        setAttributeInternal(ATTRIBUTE15, value);
    }

    /**Gets the attribute value for ATTRIBUTE2 using the alias name Attribute2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE2 using the alias name Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**Gets the attribute value for ATTRIBUTE3 using the alias name Attribute3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE3 using the alias name Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**Gets the attribute value for ATTRIBUTE4 using the alias name Attribute4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE4 using the alias name Attribute4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**Gets the attribute value for ATTRIBUTE5 using the alias name Attribute5
     */
    public String getAttribute5() {
        return (String) getAttributeInternal(ATTRIBUTE5);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE5 using the alias name Attribute5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**Gets the attribute value for ATTRIBUTE6 using the alias name Attribute6
     */
    public String getAttribute6() {
        return (String) getAttributeInternal(ATTRIBUTE6);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE6 using the alias name Attribute6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**Gets the attribute value for ATTRIBUTE7 using the alias name Attribute7
     */
    public String getAttribute7() {
        return (String) getAttributeInternal(ATTRIBUTE7);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE7 using the alias name Attribute7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**Gets the attribute value for ATTRIBUTE8 using the alias name Attribute8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE8 using the alias name Attribute8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**Gets the attribute value for ATTRIBUTE9 using the alias name Attribute9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**Sets <code>value</code> as attribute value for ATTRIBUTE9 using the alias name Attribute9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**Gets the attribute value for CREATED_BY using the alias name CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**Gets the attribute value for CREATION_DATE using the alias name CreationDate
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**Gets the attribute value for ID_EXTRA_COST using the alias name IdExtraCost
     */
    public Number getIdExtraCost() {
        return (Number) getAttributeInternal(IDEXTRACOST);
    }

    /**Sets <code>value</code> as attribute value for ID_EXTRA_COST using the alias name IdExtraCost
     */
    public void setIdExtraCost(Number value) {
        setAttributeInternal(IDEXTRACOST, value);
    }

    /**Gets the attribute value for ID_FREIGHT_CHAR using the alias name IdFreightChar
     */
    public String getIdFreightChar() {
        return (String) getAttributeInternal(IDFREIGHTCHAR);
    }

    /**Sets <code>value</code> as attribute value for ID_FREIGHT_CHAR using the alias name IdFreightChar
     */
    public void setIdFreightChar(String value) {
        setAttributeInternal(IDFREIGHTCHAR, value);
    }

    /**Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date) getAttributeInternal(LASTUPDATEDATE);
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin
     */
    public Number getLastUpdateLogin() {
        return (Number) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin
     */
    public void setLastUpdateLogin(Number value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**Gets the attribute value for RATE using the alias name Rate
     */
    public Number getRate() {
        return (Number) getAttributeInternal(RATE);
    }

    /**Sets <code>value</code> as attribute value for RATE using the alias name Rate
     */
    public void setRate(Number value) {
        setAttributeInternal(RATE, value);
    }

    /**Gets the attribute value for RETENTION_FLAG using the alias name RetentionFlag
     */
    public String getRetentionFlag() {
        return (String) getAttributeInternal(RETENTIONFLAG);
    }

    /**Sets <code>value</code> as attribute value for RETENTION_FLAG using the alias name RetentionFlag
     */
    public void setRetentionFlag(String value) {
        setAttributeInternal(RETENTIONFLAG, value);
    }

    /**Gets the attribute value for ROWID using the alias name RowID
     */
    public RowID getRowID() {
        return (RowID) getAttributeInternal(ROWID);
    }

    /**Gets the attribute value for TAX_RATE using the alias name TaxRate
     */
    public Number getTaxRate() {
        return (Number) getAttributeInternal(TAXRATE);
    }

    /**Sets <code>value</code> as attribute value for TAX_RATE using the alias name TaxRate
     */
    public void setTaxRate(Number value) {
        setAttributeInternal(TAXRATE, value);
    }

    /**Gets the attribute value for TYPE_EXTRA_COST using the alias name TypeExtraCost
     */
    public String getTypeExtraCost() {
        return (String) getAttributeInternal(TYPEEXTRACOST);
    }

    /**Sets <code>value</code> as attribute value for TYPE_EXTRA_COST using the alias name TypeExtraCost
     */
    public void setTypeExtraCost(String value) {
        setAttributeInternal(TYPEEXTRACOST, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ATTRIBUTE1:
            return getAttribute1();
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
        case CREATEDBY:
            return getCreatedBy();
        case CREATIONDATE:
            return getCreationDate();
        case IDEXTRACOST:
            return getIdExtraCost();
        case IDFREIGHTCHAR:
            return getIdFreightChar();
        case LASTUPDATEDBY:
            return getLastUpdatedBy();
        case LASTUPDATEDATE:
            return getLastUpdateDate();
        case LASTUPDATELOGIN:
            return getLastUpdateLogin();
        case RATE:
            return getRate();
        case RETENTIONFLAG:
            return getRetentionFlag();
        case ROWID:
            return getRowID();
        case TAXRATE:
            return getTaxRate();
        case TYPEEXTRACOST:
            return getTypeExtraCost();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case ATTRIBUTE1:
            setAttribute1((String)value);
            return;
        case ATTRIBUTE10:
            setAttribute10((String)value);
            return;
        case ATTRIBUTE11:
            setAttribute11((String)value);
            return;
        case ATTRIBUTE12:
            setAttribute12((String)value);
            return;
        case ATTRIBUTE13:
            setAttribute13((String)value);
            return;
        case ATTRIBUTE14:
            setAttribute14((String)value);
            return;
        case ATTRIBUTE15:
            setAttribute15((String)value);
            return;
        case ATTRIBUTE2:
            setAttribute2((String)value);
            return;
        case ATTRIBUTE3:
            setAttribute3((String)value);
            return;
        case ATTRIBUTE4:
            setAttribute4((String)value);
            return;
        case ATTRIBUTE5:
            setAttribute5((String)value);
            return;
        case ATTRIBUTE6:
            setAttribute6((String)value);
            return;
        case ATTRIBUTE7:
            setAttribute7((String)value);
            return;
        case ATTRIBUTE8:
            setAttribute8((String)value);
            return;
        case ATTRIBUTE9:
            setAttribute9((String)value);
            return;
        case CREATEDBY:
            setCreatedBy((Number)value);
            return;
        case CREATIONDATE:
            setCreationDate((Date)value);
            return;
        case IDEXTRACOST:
            setIdExtraCost((Number)value);
            return;
        case IDFREIGHTCHAR:
            setIdFreightChar((String)value);
            return;
        case LASTUPDATEDBY:
            setLastUpdatedBy((Number)value);
            return;
        case LASTUPDATEDATE:
            setLastUpdateDate((Date)value);
            return;
        case LASTUPDATELOGIN:
            setLastUpdateLogin((Number)value);
            return;
        case RATE:
            setRate((Number)value);
            return;
        case RETENTIONFLAG:
            setRetentionFlag((String)value);
            return;
        case TAXRATE:
            setTaxRate((Number)value);
            return;
        case TYPEEXTRACOST:
            setTypeExtraCost((String)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }
}
