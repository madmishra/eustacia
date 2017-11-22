package org.ecc.pmp.util;

import org.hibernate.cfg.reveng.*;

public class ReverseEngineering extends DelegatingReverseEngineeringStrategy {

	public ReverseEngineering(ReverseEngineeringStrategy delegate){
		super(delegate);
	}
	public String tableToClassName(TableIdentifier tableIdentifier){
		 if(tableIdentifier.getName().toLowerCase().startsWith("dept")) {

			   return super.tableToClassName(new TableIdentifier(tableIdentifier.getName().substring(3)));

			  } else {

			   return super.tableToClassName(tableIdentifier);

			  }
	}
	
	
}
