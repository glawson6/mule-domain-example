package com.cox.automotive.edi9.namespacemapper;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

//import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;


public class CompanyNamespaceMapper extends NamespacePrefixMapper
{

	private static final String COMPANY_PREFIX = "cs";
    private static final String COKPANY_URI = "http://www.manheim.com/2009/01/CustSchema";

	@Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        if(COKPANY_URI.equals(namespaceUri)) {
            return COMPANY_PREFIX;
        }
        return suggestion;
    }

    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[] { COMPANY_PREFIX };
    }

}
