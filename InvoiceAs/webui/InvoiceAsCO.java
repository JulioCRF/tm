/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package xxgam.oracle.apps.xbol.tm.InvoiceAs.webui;

import com.sun.rowset.internal.Row;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.OAViewObject;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.jbo.RowSetIterator;

import xxgam.oracle.apps.xbol.tm.InvoiceAs.server.DetailVOImpl;
import xxgam.oracle.apps.xbol.tm.InvoiceAs.server.InvoiceAsAMImpl;
import xxgam.oracle.apps.xbol.tm.RatesM.InsertRate.server.InsertRateAMImpl;

/**
 * Controller for ...
 */
public class InvoiceAsCO extends OAControllerImpl
{
  public static final String RCS_ID="$Header$";
  public static final boolean RCS_ID_RECORDED =
        VersionInfo.recordClassVersion(RCS_ID, "%packagename%");

  /**
   * Layout and page setup logic for a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processRequest(pageContext, webBean);
      System.out.println("InvoiceAsCO Entro a PR");
      if (!pageContext.isFormSubmission()) {

          System.out.println("Debug 1 !isFormSubmission()");
      } else
          System.out.println("Debug 2 isFormSubmission()");  }

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);
    
      InvoiceAsAMImpl am = (InvoiceAsAMImpl)pageContext.getApplicationModule(webBean);
     
      String provider = pageContext.getParameter("Provider");    
      
    if (pageContext.getParameter("Go") != null ){
        System.out.println("InvoiceAsCO Provider: " + provider);
        System.out.println("InvoiceAsCO Go pressed");
        am.filterInvoices(provider);
    }

    if (pageContext.getParameter("Conciliar") != null ){
        System.out.println("InvoiceAsCO presionado conciliar ");
        am.checker();
        am.apply();
        System.out.println("commit");
    }
    
    
  }

}
