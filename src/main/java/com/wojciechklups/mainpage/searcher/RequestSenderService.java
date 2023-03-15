/***********************************************************
 *
 * Copyright (c) 2022 Wojciech Klupś
 *
 * All rights reserved
 *
 ************************************************************/
package com.wojciechklups.mainpage.searcher;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

/**
 * @author Author: wklups
 * @timestamp Date: 2023-03-08 20:57:01 +0200 (08 mar 2023)
 */
@AllArgsConstructor
@Service
public class RequestSenderService
{
    @Autowired
    private WebClient webClient;

    public String getCeneoPage(String searchedPhrase)
    {
        return webClient.get()
                .uri("https://www.ceneo.pl/szukaj-" + searchedPhrase + ";0112-0.htm")
                .retrieve()
                .bodyToMono(String.class)
                .block(Duration.ofSeconds(4));
    }
}
