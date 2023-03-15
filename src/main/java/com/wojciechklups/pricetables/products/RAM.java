/***********************************************************
 *
 * Copyright (c) 2022 Wojciech Klupś
 *
 * All rights reserved
 *
 ************************************************************/
package com.wojciechklups.pricetables.products;

import lombok.*;

/**
 * @author Author: wklups
 * @timestamp Date: 2023-03-01 20:30:29 +0200 (01 mar 2023)
 */
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class RAM
{
    @NonNull
    public String ramName;
    @NonNull
    public RamType ramType;
    public int ramOverallCapacity;
    public int ramModules;
    public int ramClock;
    public int ramCycleLatency;
}
