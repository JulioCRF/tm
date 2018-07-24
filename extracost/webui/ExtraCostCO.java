/*===========================================================================+
 |   Copyright (c) 2001, 2005 Oracle Corporation, Redwood Shores, CA, USA    |
 |                         All rights reserved.                              |
 +===========================================================================+
 |  HISTORY                                                                  |
 +===========================================================================*/
package xxgam.oracle.apps.xbol.tm.extracost.webui;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

import oracle.jbo.domain.Date;

import xxgam.oracle.apps.xbol.tm.extracost.server.ExtraCostImpl;
//import xxgam.oracle.apps.xbol.tm.ratesM.search.server.RatesMAMImpl;

/**
 * Controller for ...
 */
public class ExtraCostCO extends OAControllerImpl
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
        System.out.println("Debug1");       
    }//if(!pageContext.isFormSubmission())
    else
        System.out.println("Debug2");
  }//fin de public void processRequest(OAPageContext pageContext, OAWebBean webBean)

  /**
   * Procedure to handle form submissions for form elements in
   * a region.
   * @param pageContext the current OA page context
   * @param webBean the web bean corresponding to the region
   */
  public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)
  {
    super.processFormRequest(pageContext, webBean);
      String strEventParam = pageContext.getParameter(this.EVENT_PARAM);
      ExtraCostImpl extraCostImpl = (ExtraCostImpl)pageContext.getApplicationModule(webBean);  
    
    
    
    if(null!=pageContext.getParameter("BuscarBtn")){
        //capturamos variables e internamente llenamos la tabla
        extraCostImpl.getVariables(pageContext, webBean);
        ExtraCostImpl AM = (ExtraCostImpl)pageContext.getApplicationModule(webBean);
          pageContext.writeDiagnostics(this, "Calling Method", 1);
          AM.MasterDetails(pageContext,webBean);
         }
    
    if("updateEvent".equals(strEventParam)){
        System.out.println("Entro en el evento del boton actualizar");
        System.out.println("pIdExtraCost:   "+pageContext.getParameter("pIdExtraCost"));
    }//fin de if("updateEvent".equals(strEventParam))
    
    if("deleteEvent".equals(strEventParam)){
        System.out.println("Entro en el evento del boton borrar");
        System.out.println("pIdExtraCost:   "+pageContext.getParameter("pIdExtraCost"));
    }//fin de if("deleteEvent".equals(strEventParam))
    
  }//fin de public void processFormRequest(OAPageContext pageContext, OAWebBean webBean)

}//fin de ExtraCostCO
