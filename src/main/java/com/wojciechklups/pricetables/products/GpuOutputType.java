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
 * @timestamp Date: 2023-03-08 09:34:29 +0200 (08 mar 2023)
 */
@Getter
@AllArgsConstructor
public enum GpuOutputType
{
    HDMI("HDMI"),
    DISPLAY_PORT("Display port");

    private final String name;
}
