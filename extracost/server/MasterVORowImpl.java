package xxgam.oracle.apps.xbol.tm.extracost.server;

import oracle.apps.fnd.framework.server.OAViewRowImpl;

import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MasterVORowImpl extends OAViewRowImpl {
    public static final int IDFREIGHT = 0;
    public static final int IDFOLIO = 1;
    public static final int IDSTRETCH = 2;
    public static final int IDFREIGHTCHAR = 3;
    public static final int IDREQUEST = 4;
    public static final int USERATE = 5;
    public static final int IDSTATUS = 6;
    public static final int STATUS = 7;
    public static final int IDCLASSIFICATION = 8;
    public static final int CLASSIFICATION = 9;
    public static final int IDORIGIN = 10;
    public static final int ORIGIN = 11;
    public static final int IDZONE = 12;
    public static final int ZONEDESC = 13;
    public static final int IDDISTRIBUTION = 14;
    public static final int DISTRIBUTIONCODE = 15;
    public static final int DISTRIBUTION = 16;
    public static final int IDDESTINATION = 17;
    public static final int DESTINATION = 18;
    public static final int IDMEDIA = 19;
    public static final int MEDIA = 20;
    public static final int IDMODE = 21;
    public static final int MODECODE = 22;
    public static final int MODEDESC = 23;
    public static final int IDPROVIDER = 24;
    public static final int PROVIDER = 25;
    public static final int ETD = 26;
    public static final int ETDHOUR = 27;
    public static final int ETA = 28;
    public static final int ETAHOUR = 29;
    public static final int ARRIVALDATE = 30;
    public static final int ARRIVALTIME = 31;
    public static final int FREIGHTJOB = 32;
    public static final int AWBBOL = 33;
    public static final int FLIGHT = 34;
    public static final int PEDIMENT = 35;
    public static final int MULTIPLEDELIVERIESFLAG = 36;
    public static final int NUMDELIVERIES = 37;
    public static final int INVOICESTATUS = 38;
    public static final int DOCUMENT1 = 39;
    public static final int DOCUMENT2 = 40;
    public static final int DOCUMENT3 = 41;
    public static final int DOCUMENT4 = 42;
    public static final int ATTRIBUTE1 = 43;
    public static final int ATTRIBUTE2 = 44;
    public static final int ATTRIBUTE3 = 45;
    public static final int ATTRIBUTE4 = 46;
    public static final int ATTRIBUTE5 = 47;
    public static final int ATTRIBUTE6 = 48;
    public static final int ATTRIBUTE7 = 49;
    public static final int ATTRIBUTE8 = 50;
    public static final int ATTRIBUTE9 = 51;
    public static final int ATTRIBUTE10 = 52;
    public static final int LASTUPDATEDATE = 53;
    public static final int LASTUPDATEDBY = 54;
    public static final int CREATIONDATE = 55;
    public static final int CREATEDBY = 56;
    public static final int LASTUPDATELOGIN = 57;
    public static final int PRIORITYCODE = 58;
    public static final int PRIORITY = 59;
    public static final int DETAILFLAG = 60;
    public static final int DETAILVO = 61;

    /**This is the default constructor (do not remove)
     */
    public MasterVORowImpl() {
    }

    /**Gets the attribute value for the calculated attribute IdFreight
     */
    public Number getIdFreight() {
        return (Number) getAttributeInternal(IDFREIGHT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdFreight
     */
    public void setIdFreight(Number value) {
        setAttributeInternal(IDFREIGHT, value);
    }

    /**Gets the attribute value for the calculated attribute IdFolio
     */
    public Number getIdFolio() {
        return (Number) getAttributeInternal(IDFOLIO);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdFolio
     */
    public void setIdFolio(Number value) {
        setAttributeInternal(IDFOLIO, value);
    }

    /**Gets the attribute value for the calculated attribute IdStretch
     */
    public Number getIdStretch() {
        return (Number) getAttributeInternal(IDSTRETCH);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdStretch
     */
    public void setIdStretch(Number value) {
        setAttributeInternal(IDSTRETCH, value);
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

    /**Gets the attribute value for the calculated attribute IdRequest
     */
    public Number getIdRequest() {
        return (Number) getAttributeInternal(IDREQUEST);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdRequest
     */
    public void setIdRequest(Number value) {
        setAttributeInternal(IDREQUEST, value);
    }

    /**Gets the attribute value for the calculated attribute UseRate
     */
    public String getUseRate() {
        return (String) getAttributeInternal(USERATE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute UseRate
     */
    public void setUseRate(String value) {
        setAttributeInternal(USERATE, value);
    }

    /**Gets the attribute value for the calculated attribute IdStatus
     */
    public Number getIdStatus() {
        return (Number) getAttributeInternal(IDSTATUS);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdStatus
     */
    public void setIdStatus(Number value) {
        setAttributeInternal(IDSTATUS, value);
    }

    /**Gets the attribute value for the calculated attribute Status
     */
    public String getStatus() {
        return (String) getAttributeInternal(STATUS);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Status
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**Gets the attribute value for the calculated attribute IdClassification
     */
    public Number getIdClassification() {
        return (Number) getAttributeInternal(IDCLASSIFICATION);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdClassification
     */
    public void setIdClassification(Number value) {
        setAttributeInternal(IDCLASSIFICATION, value);
    }

    /**Gets the attribute value for the calculated attribute Classification
     */
    public String getClassification() {
        return (String) getAttributeInternal(CLASSIFICATION);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Classification
     */
    public void setClassification(String value) {
        setAttributeInternal(CLASSIFICATION, value);
    }

    /**Gets the attribute value for the calculated attribute IdOrigin
     */
    public Number getIdOrigin() {
        return (Number) getAttributeInternal(IDORIGIN);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdOrigin
     */
    public void setIdOrigin(Number value) {
        setAttributeInternal(IDORIGIN, value);
    }

    /**Gets the attribute value for the calculated attribute Origin
     */
    public String getOrigin() {
        return (String) getAttributeInternal(ORIGIN);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Origin
     */
    public void setOrigin(String value) {
        setAttributeInternal(ORIGIN, value);
    }

    /**Gets the attribute value for the calculated attribute IdZone
     */
    public Number getIdZone() {
        return (Number) getAttributeInternal(IDZONE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdZone
     */
    public void setIdZone(Number value) {
        setAttributeInternal(IDZONE, value);
    }

    /**Gets the attribute value for the calculated attribute ZoneDesc
     */
    public String getZoneDesc() {
        return (String) getAttributeInternal(ZONEDESC);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ZoneDesc
     */
    public void setZoneDesc(String value) {
        setAttributeInternal(ZONEDESC, value);
    }

    /**Gets the attribute value for the calculated attribute IdDistribution
     */
    public Number getIdDistribution() {
        return (Number) getAttributeInternal(IDDISTRIBUTION);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdDistribution
     */
    public void setIdDistribution(Number value) {
        setAttributeInternal(IDDISTRIBUTION, value);
    }

    /**Gets the attribute value for the calculated attribute DistributionCode
     */
    public String getDistributionCode() {
        return (String) getAttributeInternal(DISTRIBUTIONCODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute DistributionCode
     */
    public void setDistributionCode(String value) {
        setAttributeInternal(DISTRIBUTIONCODE, value);
    }

    /**Gets the attribute value for the calculated attribute Distribution
     */
    public String getDistribution() {
        return (String) getAttributeInternal(DISTRIBUTION);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Distribution
     */
    public void setDistribution(String value) {
        setAttributeInternal(DISTRIBUTION, value);
    }

    /**Gets the attribute value for the calculated attribute IdDestination
     */
    public Number getIdDestination() {
        return (Number) getAttributeInternal(IDDESTINATION);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdDestination
     */
    public void setIdDestination(Number value) {
        setAttributeInternal(IDDESTINATION, value);
    }

    /**Gets the attribute value for the calculated attribute Destination
     */
    public String getDestination() {
        return (String) getAttributeInternal(DESTINATION);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Destination
     */
    public void setDestination(String value) {
        setAttributeInternal(DESTINATION, value);
    }

    /**Gets the attribute value for the calculated attribute IdMedia
     */
    public Number getIdMedia() {
        return (Number) getAttributeInternal(IDMEDIA);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdMedia
     */
    public void setIdMedia(Number value) {
        setAttributeInternal(IDMEDIA, value);
    }

    /**Gets the attribute value for the calculated attribute Media
     */
    public String getMedia() {
        return (String) getAttributeInternal(MEDIA);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Media
     */
    public void setMedia(String value) {
        setAttributeInternal(MEDIA, value);
    }

    /**Gets the attribute value for the calculated attribute IdMode
     */
    public Number getIdMode() {
        return (Number) getAttributeInternal(IDMODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdMode
     */
    public void setIdMode(Number value) {
        setAttributeInternal(IDMODE, value);
    }

    /**Gets the attribute value for the calculated attribute ModeCode
     */
    public String getModeCode() {
        return (String) getAttributeInternal(MODECODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ModeCode
     */
    public void setModeCode(String value) {
        setAttributeInternal(MODECODE, value);
    }

    /**Gets the attribute value for the calculated attribute ModeDesc
     */
    public String getModeDesc() {
        return (String) getAttributeInternal(MODEDESC);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ModeDesc
     */
    public void setModeDesc(String value) {
        setAttributeInternal(MODEDESC, value);
    }

    /**Gets the attribute value for the calculated attribute IdProvider
     */
    public Number getIdProvider() {
        return (Number) getAttributeInternal(IDPROVIDER);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute IdProvider
     */
    public void setIdProvider(Number value) {
        setAttributeInternal(IDPROVIDER, value);
    }

    /**Gets the attribute value for the calculated attribute Provider
     */
    public String getProvider() {
        return (String) getAttributeInternal(PROVIDER);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Provider
     */
    public void setProvider(String value) {
        setAttributeInternal(PROVIDER, value);
    }

    /**Gets the attribute value for the calculated attribute Etd
     */
    public Date getEtd() {
        return (Date) getAttributeInternal(ETD);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Etd
     */
    public void setEtd(Date value) {
        setAttributeInternal(ETD, value);
    }

    /**Gets the attribute value for the calculated attribute EtdHour
     */
    public String getEtdHour() {
        return (String) getAttributeInternal(ETDHOUR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute EtdHour
     */
    public void setEtdHour(String value) {
        setAttributeInternal(ETDHOUR, value);
    }

    /**Gets the attribute value for the calculated attribute Eta
     */
    public Date getEta() {
        return (Date) getAttributeInternal(ETA);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Eta
     */
    public void setEta(Date value) {
        setAttributeInternal(ETA, value);
    }

    /**Gets the attribute value for the calculated attribute EtaHour
     */
    public String getEtaHour() {
        return (String) getAttributeInternal(ETAHOUR);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute EtaHour
     */
    public void setEtaHour(String value) {
        setAttributeInternal(ETAHOUR, value);
    }

    /**Gets the attribute value for the calculated attribute ArrivalDate
     */
    public Date getArrivalDate() {
        return (Date) getAttributeInternal(ARRIVALDATE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ArrivalDate
     */
    public void setArrivalDate(Date value) {
        setAttributeInternal(ARRIVALDATE, value);
    }

    /**Gets the attribute value for the calculated attribute ArrivalTime
     */
    public String getArrivalTime() {
        return (String) getAttributeInternal(ARRIVALTIME);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute ArrivalTime
     */
    public void setArrivalTime(String value) {
        setAttributeInternal(ARRIVALTIME, value);
    }

    /**Gets the attribute value for the calculated attribute FreightJob
     */
    public String getFreightJob() {
        return (String) getAttributeInternal(FREIGHTJOB);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute FreightJob
     */
    public void setFreightJob(String value) {
        setAttributeInternal(FREIGHTJOB, value);
    }

    /**Gets the attribute value for the calculated attribute AwbBol
     */
    public String getAwbBol() {
        return (String) getAttributeInternal(AWBBOL);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute AwbBol
     */
    public void setAwbBol(String value) {
        setAttributeInternal(AWBBOL, value);
    }

    /**Gets the attribute value for the calculated attribute Flight
     */
    public String getFlight() {
        return (String) getAttributeInternal(FLIGHT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Flight
     */
    public void setFlight(String value) {
        setAttributeInternal(FLIGHT, value);
    }

    /**Gets the attribute value for the calculated attribute Pediment
     */
    public String getPediment() {
        return (String) getAttributeInternal(PEDIMENT);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Pediment
     */
    public void setPediment(String value) {
        setAttributeInternal(PEDIMENT, value);
    }

    /**Gets the attribute value for the calculated attribute MultipleDeliveriesFlag
     */
    public String getMultipleDeliveriesFlag() {
        return (String) getAttributeInternal(MULTIPLEDELIVERIESFLAG);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute MultipleDeliveriesFlag
     */
    public void setMultipleDeliveriesFlag(String value) {
        setAttributeInternal(MULTIPLEDELIVERIESFLAG, value);
    }

    /**Gets the attribute value for the calculated attribute NumDeliveries
     */
    public Number getNumDeliveries() {
        return (Number) getAttributeInternal(NUMDELIVERIES);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute NumDeliveries
     */
    public void setNumDeliveries(Number value) {
        setAttributeInternal(NUMDELIVERIES, value);
    }

    /**Gets the attribute value for the calculated attribute InvoiceStatus
     */
    public String getInvoiceStatus() {
        return (String) getAttributeInternal(INVOICESTATUS);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute InvoiceStatus
     */
    public void setInvoiceStatus(String value) {
        setAttributeInternal(INVOICESTATUS, value);
    }

    /**Gets the attribute value for the calculated attribute Document1
     */
    public String getDocument1() {
        return (String) getAttributeInternal(DOCUMENT1);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Document1
     */
    public void setDocument1(String value) {
        setAttributeInternal(DOCUMENT1, value);
    }

    /**Gets the attribute value for the calculated attribute Document2
     */
    public String getDocument2() {
        return (String) getAttributeInternal(DOCUMENT2);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Document2
     */
    public void setDocument2(String value) {
        setAttributeInternal(DOCUMENT2, value);
    }

    /**Gets the attribute value for the calculated attribute Document3
     */
    public String getDocument3() {
        return (String) getAttributeInternal(DOCUMENT3);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Document3
     */
    public void setDocument3(String value) {
        setAttributeInternal(DOCUMENT3, value);
    }

    /**Gets the attribute value for the calculated attribute Document4
     */
    public String getDocument4() {
        return (String) getAttributeInternal(DOCUMENT4);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Document4
     */
    public void setDocument4(String value) {
        setAttributeInternal(DOCUMENT4, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute1
     */
    public String getAttribute1() {
        return (String) getAttributeInternal(ATTRIBUTE1);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute2
     */
    public String getAttribute2() {
        return (String) getAttributeInternal(ATTRIBUTE2);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute3
     */
    public String getAttribute3() {
        return (String) getAttributeInternal(ATTRIBUTE3);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute4
     */
    public String getAttribute4() {
        return (String) getAttributeInternal(ATTRIBUTE4);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute5
     */
    public String getAttribute5() {
        return (String) getAttributeInternal(ATTRIBUTE5);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute6
     */
    public String getAttribute6() {
        return (String) getAttributeInternal(ATTRIBUTE6);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute7
     */
    public String getAttribute7() {
        return (String) getAttributeInternal(ATTRIBUTE7);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute8
     */
    public String getAttribute8() {
        return (String) getAttributeInternal(ATTRIBUTE8);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute9
     */
    public String getAttribute9() {
        return (String) getAttributeInternal(ATTRIBUTE9);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**Gets the attribute value for the calculated attribute Attribute10
     */
    public String getAttribute10() {
        return (String) getAttributeInternal(ATTRIBUTE10);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Attribute10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
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

    /**Gets the attribute value for the calculated attribute PriorityCode
     */
    public String getPriorityCode() {
        return (String) getAttributeInternal(PRIORITYCODE);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute PriorityCode
     */
    public void setPriorityCode(String value) {
        setAttributeInternal(PRIORITYCODE, value);
    }

    /**Gets the attribute value for the calculated attribute Priority
     */
    public String getPriority() {
        return (String) getAttributeInternal(PRIORITY);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute Priority
     */
    public void setPriority(String value) {
        setAttributeInternal(PRIORITY, value);
    }

    /**Gets the attribute value for the calculated attribute DetailFlag
     */
    public Boolean getDetailFlag() {
        return (Boolean) getAttributeInternal(DETAILFLAG);
    }

    /**Sets <code>value</code> as the attribute value for the calculated attribute DetailFlag
     */
    public void setDetailFlag(Boolean value) {
        setAttributeInternal(DETAILFLAG, value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case IDFREIGHT:
            return getIdFreight();
        case IDFOLIO:
            return getIdFolio();
        case IDSTRETCH:
            return getIdStretch();
        case IDFREIGHTCHAR:
            return getIdFreightChar();
        case IDREQUEST:
            return getIdRequest();
        case USERATE:
            return getUseRate();
        case IDSTATUS:
            return getIdStatus();
        case STATUS:
            return getStatus();
        case IDCLASSIFICATION:
            return getIdClassification();
        case CLASSIFICATION:
            return getClassification();
        case IDORIGIN:
            return getIdOrigin();
        case ORIGIN:
            return getOrigin();
        case IDZONE:
            return getIdZone();
        case ZONEDESC:
            return getZoneDesc();
        case IDDISTRIBUTION:
            return getIdDistribution();
        case DISTRIBUTIONCODE:
            return getDistributionCode();
        case DISTRIBUTION:
            return getDistribution();
        case IDDESTINATION:
            return getIdDestination();
        case DESTINATION:
            return getDestination();
        case IDMEDIA:
            return getIdMedia();
        case MEDIA:
            return getMedia();
        case IDMODE:
            return getIdMode();
        case MODECODE:
            return getModeCode();
        case MODEDESC:
            return getModeDesc();
        case IDPROVIDER:
            return getIdProvider();
        case PROVIDER:
            return getProvider();
        case ETD:
            return getEtd();
        case ETDHOUR:
            return getEtdHour();
        case ETA:
            return getEta();
        case ETAHOUR:
            return getEtaHour();
        case ARRIVALDATE:
            return getArrivalDate();
        case ARRIVALTIME:
            return getArrivalTime();
        case FREIGHTJOB:
            return getFreightJob();
        case AWBBOL:
            return getAwbBol();
        case FLIGHT:
            return getFlight();
        case PEDIMENT:
            return getPediment();
        case MULTIPLEDELIVERIESFLAG:
            return getMultipleDeliveriesFlag();
        case NUMDELIVERIES:
            return getNumDeliveries();
        case INVOICESTATUS:
            return getInvoiceStatus();
        case DOCUMENT1:
            return getDocument1();
        case DOCUMENT2:
            return getDocument2();
        case DOCUMENT3:
            return getDocument3();
        case DOCUMENT4:
            return getDocument4();
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
        case LASTUPDATEDATE:
            return getLastUpdateDate();
        case LASTUPDATEDBY:
            return getLastUpdatedBy();
        case CREATIONDATE:
            return getCreationDate();
        case CREATEDBY:
            return getCreatedBy();
        case LASTUPDATELOGIN:
            return getLastUpdateLogin();
        case PRIORITYCODE:
            return getPriorityCode();
        case PRIORITY:
            return getPriority();
        case DETAILFLAG:
            return getDetailFlag();
        case DETAILVO:
            return getDetailVO();
        default:
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        switch (index) {
        case IDFREIGHT:
            setIdFreight((Number)value);
            return;
        case IDFOLIO:
            setIdFolio((Number)value);
            return;
        case IDSTRETCH:
            setIdStretch((Number)value);
            return;
        case IDFREIGHTCHAR:
            setIdFreightChar((String)value);
            return;
        case IDREQUEST:
            setIdRequest((Number)value);
            return;
        case USERATE:
            setUseRate((String)value);
            return;
        case IDSTATUS:
            setIdStatus((Number)value);
            return;
        case STATUS:
            setStatus((String)value);
            return;
        case IDCLASSIFICATION:
            setIdClassification((Number)value);
            return;
        case CLASSIFICATION:
            setClassification((String)value);
            return;
        case IDORIGIN:
            setIdOrigin((Number)value);
            return;
        case ORIGIN:
            setOrigin((String)value);
            return;
        case IDZONE:
            setIdZone((Number)value);
            return;
        case ZONEDESC:
            setZoneDesc((String)value);
            return;
        case IDDISTRIBUTION:
            setIdDistribution((Number)value);
            return;
        case DISTRIBUTIONCODE:
            setDistributionCode((String)value);
            return;
        case DISTRIBUTION:
            setDistribution((String)value);
            return;
        case IDDESTINATION:
            setIdDestination((Number)value);
            return;
        case DESTINATION:
            setDestination((String)value);
            return;
        case IDMEDIA:
            setIdMedia((Number)value);
            return;
        case MEDIA:
            setMedia((String)value);
            return;
        case IDMODE:
            setIdMode((Number)value);
            return;
        case MODECODE:
            setModeCode((String)value);
            return;
        case MODEDESC:
            setModeDesc((String)value);
            return;
        case IDPROVIDER:
            setIdProvider((Number)value);
            return;
        case PROVIDER:
            setProvider((String)value);
            return;
        case ETD:
            setEtd((Date)value);
            return;
        case ETDHOUR:
            setEtdHour((String)value);
            return;
        case ETA:
            setEta((Date)value);
            return;
        case ETAHOUR:
            setEtaHour((String)value);
            return;
        case ARRIVALDATE:
            setArrivalDate((Date)value);
            return;
        case ARRIVALTIME:
            setArrivalTime((String)value);
            return;
        case FREIGHTJOB:
            setFreightJob((String)value);
            return;
        case AWBBOL:
            setAwbBol((String)value);
            return;
        case FLIGHT:
            setFlight((String)value);
            return;
        case PEDIMENT:
            setPediment((String)value);
            return;
        case MULTIPLEDELIVERIESFLAG:
            setMultipleDeliveriesFlag((String)value);
            return;
        case NUMDELIVERIES:
            setNumDeliveries((Number)value);
            return;
        case INVOICESTATUS:
            setInvoiceStatus((String)value);
            return;
        case DOCUMENT1:
            setDocument1((String)value);
            return;
        case DOCUMENT2:
            setDocument2((String)value);
            return;
        case DOCUMENT3:
            setDocument3((String)value);
            return;
        case DOCUMENT4:
            setDocument4((String)value);
            return;
        case ATTRIBUTE1:
            setAttribute1((String)value);
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
        case ATTRIBUTE10:
            setAttribute10((String)value);
            return;
        case LASTUPDATEDATE:
            setLastUpdateDate((Date)value);
            return;
        case LASTUPDATEDBY:
            setLastUpdatedBy((Number)value);
            return;
        case CREATIONDATE:
            setCreationDate((Date)value);
            return;
        case CREATEDBY:
            setCreatedBy((Number)value);
            return;
        case LASTUPDATELOGIN:
            setLastUpdateLogin((Number)value);
            return;
        case PRIORITYCODE:
            setPriorityCode((String)value);
            return;
        case PRIORITY:
            setPriority((String)value);
            return;
        case DETAILFLAG:
            setDetailFlag((Boolean)value);
            return;
        default:
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }

    /**Gets the associated <code>RowIterator</code> using master-detail link DetailVO
     */
    public RowIterator getDetailVO() {
        return (RowIterator)getAttributeInternal(DETAILVO);
    }
}