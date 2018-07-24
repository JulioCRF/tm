/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package xxgam.oracle.apps.xbol.tm.request.webui;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import xxgam.oracle.apps.xbol.tm.RatesM.search.server.RatesMAMImpl;
import xxgam.oracle.apps.xbol.tm.extracost.server.ExtraCostImpl;
import xxgam.oracle.apps.xbol.tm.request.server.PruebaVOImpl;
import xxgam.oracle.apps.xbol.tm.request.server.RequestAMImpl;

/**
 * Controller for ...
 */
public class RequestCO extends OAControllerImpl
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
    if(!pageContext.isFormSubmission()){
        System.out.println("Debug 1");
        OAPageContext oAPageContext = (OAPageContext)pageContext;
              String lang = oAPageContext.getBaseLanguage();
        //oAPageContext.setb
              System.out.println("lenguaje: "+lang);
        String lang1 = oAPageContext.getCurrentLanguage();
        //oAPageContext.setb
        System.out.println("lenguaje1: "+lang1);
        RequestAMImpl requestAMImpl = (RequestAMImpl)pageContext.getApplicationModule(webBean);   
        requestAMImpl.fillTable1();    
       
    }//fin de if(!pageContext.isFormSubmission())
    else{
        System.out.println("Debug 2");
        System.out.println("Hola git");
        System.out.println("hola git hub");
    }//fin de else
  }//fin de processRequest

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);
         
  }//fin de processFormRequest

}//fin de clase controlador
