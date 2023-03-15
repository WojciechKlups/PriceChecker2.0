/***********************************************************
 *
 * Copyright (c) 2022 Wojciech Klupś
 *
 * All rights reserved
 *
 ************************************************************/
package com.wojciechklups.pricetables.products;

import lombok.*;

import java.util.List;

/**
 * @author Author: wklups
 * @timestamp Date: 2023-03-01 20:30:15 +0200 (01 mar 2023)
 */

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class CPU
{
    @NonNull
    public String cpuName;
    public int cpuClock;
    public CpuSocket cpuSocket;
    public int cpuCores;
    public int cpuThreads;
    public boolean unlocked;
    public boolean hasGraphicsModule;
    public List<RamType> typesOfHandledMemory;
}
