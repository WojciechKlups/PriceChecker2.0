/***********************************************************
 *
 * Copyright (c) 2022 Wojciech Klupś
 *
 * All rights reserved
 *
 ************************************************************/
package com.wojciechklups.userdetails;

import com.wojciechklups.pricetables.PartsSet;
import lombok.AllArgsConstructor;

import java.util.Set;

/**
 * @author Author: wklups
 * @timestamp Date: 2023-03-01 20:21:26 +0200 (01 mar 2023)
 */
@AllArgsConstructor
public class User
{
    public String username;
    public Set<PartsSet> savedSets;

    public User getUser(String username)
    {
        return null; //return user from db by username
    }

}
