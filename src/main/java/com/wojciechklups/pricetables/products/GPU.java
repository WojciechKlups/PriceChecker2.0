/***********************************************************
 *
 * Copyright (c) 2022 Wojciech Klupś
 *
 * All rights reserved
 *
 ************************************************************/
package com.wojciechklups.pricetables.products;

import lombok.*;

import java.util.Map;

/**
 * @author Author: wklups
 * @timestamp Date: 2023-03-01 20:30:21 +0200 (01 mar 2023)
 */
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class GPU
{
    @NonNull
    public String gpuName;
    @NonNull
    public String gpuSystem;
    public int gpuMemory;
    public String gpuMemoryType;
    public String gpuMemoryBus;
    public int gpuCoreClock;
    public int gpuMemoryClock;
    public int gpuCudaCores;
    public int gpuTDP;
    public Map<GpuOutputType, Integer> gpuOutputTypes;
}
