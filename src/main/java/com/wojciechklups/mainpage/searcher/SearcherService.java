/***********************************************************
 *
 * Copyright (c) 2022 Wojciech Klupś
 *
 * All rights reserved
 *
 ************************************************************/
package com.wojciechklups.mainpage.searcher;

import com.wojciechklups.mainpage.WebClientPreparer;
import com.wojciechklups.pricetables.products.Part;
import org.w3c.dom.Document;

/**
 * @author Author: wklups
 * @timestamp Date: 2023-03-08 20:52:16 +0200 (08 mar 2023)
 */
public class SearcherService
{
    RequestSenderService requestSenderService = new RequestSenderService(WebClientPreparer.webClient());

    public Part getPart(String searchPhrase)
    {
        String ceneoPage = requestSenderService.getCeneoPage(searchPhrase);



        System.out.println("TEST");

        return null;
    }




}
