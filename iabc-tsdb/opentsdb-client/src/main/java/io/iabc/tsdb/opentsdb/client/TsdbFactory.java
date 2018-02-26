/*
 * Project: dubbomm
 *
 * File Created at 2018-02-05
 *
 * Copyright 2012-2015 Greenline.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Greenline Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Greenline.com.
 */
package io.iabc.tsdb.opentsdb.client;

import io.iabc.tsdb.opentsdb.client.impl.HttpBasedTsdbImpl;

/**
 * TODO
 *
 * @author <a href="mailto:h@iabc.io">shuchen</a>
 * @author <a href="mailto:h@heyx.net">shuchen</a>
 * @version V1.0
 * @since 2018-02-05 13:49
 */
public class TsdbFactory {
    ///////////////////////////// Class Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //////////////////////////////// Attributes \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    /////////////////////////////// Constructors \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    ////////////////////////////// Class Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public static Tsdb getTsdb(final String url) {

        TsdbService tsdbService = TsdbConnectionFactory.getConnection(url, "", "");

        Tsdb tsdb = new HttpBasedTsdbImpl(tsdbService);

        return tsdb;

    }

    public static Tsdb getTsdb(final String url, final String username, final String password) {

        TsdbService tsdbService = TsdbConnectionFactory.getConnection(url, username, password);

        Tsdb tsdb = new HttpBasedTsdbImpl(tsdbService);

        return tsdb;

    }

    ////////////////////////////////// Methods \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    //------------------------ Implements: 

    //------------------------ Overrides:

    //---------------------------- Abstract Methods -----------------------------

    //---------------------------- Utility Methods ------------------------------

    //---------------------------- Property Methods -----------------------------
}
