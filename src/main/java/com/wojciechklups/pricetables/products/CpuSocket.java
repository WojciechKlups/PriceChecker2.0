/***********************************************************
 *
 * Copyright (c) 2022 Wojciech Klupś
 *
 * All rights reserved
 *
 ************************************************************/
package com.wojciechklups.pricetables.products;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Author: wklups
 * @timestamp Date: 2023-03-08 11:36:26 +0200 (08 mar 2023)
 */
@Getter
@AllArgsConstructor
public enum CpuSocket
{
    SOCKET_1700("Socket 1700"),
    SOCKET_1200("Socket 1200"),
    SOCKET_1151("Socket 1151"),
    SOCKET_AM5("Socket AM5"),
    SOCKET_AM4("Socket AM4");

    private final String name;

}
