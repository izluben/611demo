/* ===========================================================================
 * Copyright (c) 2018 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 01/22/2018  7:21 PM
 */
package com.support611.data.configuration;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MyBatisSqlSessionFactory {
    private static final SqlSessionFactory FACTORY;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("data/Configuration.xml");
            FACTORY = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e){
            throw new RuntimeException("Fatal Error.  Cause: " + e, e);
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return FACTORY;
    }
}
