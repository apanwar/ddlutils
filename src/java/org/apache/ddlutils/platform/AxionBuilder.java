package org.apache.ddlutils.platform;

/*
 * Copyright 1999-2005 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;

import org.apache.ddlutils.PlatformInfo;
import org.apache.ddlutils.model.Table;

/**
 * The SQL Builder for the Axion database.
 * 
 * @author James Strachan
 * @author Thomas Dudziak
 * @version $Revision$
 */
public class AxionBuilder extends SqlBuilder
{
    /**
     * Creates a new axion sql builder.
     * 
     * @param info The plaftform information
     */
    public AxionBuilder(PlatformInfo info)
    {
        super(info);
    }

    /**
     * {@inheritDoc}
     */
    public void dropTable(Table table) throws IOException
    { 
        print("DROP TABLE IF EXISTS ");
        printIdentifier(getTableName(table));
        printEndOfStatement();
    }
}