/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.kendo.ui.scheduler;

import com.googlecode.wicket.kendo.ui.KendoDataSource;

/**
 * Provide the data-source for the {@link Scheduler}
 *
 * @author Sebastien Briquet - sebfz1
 */
public class SchedulerDataSource extends KendoDataSource
{
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor which create a JSON based data-source
	 *
	 * @param name the data-source name
	 */
	public SchedulerDataSource(String name)
	{
		this(name, TYPE);
	}

	/**
	 * Constructor
	 *
	 * @param name the data-source name
	 * @param type the response type (json, xml)
	 */
	public SchedulerDataSource(String name, String type)
	{
		super(name, type);

		this.set("change", "function(e) { if (e.action === 'sync') { this.read(); } }");
	}

	// Properties //

	@Override
	public String toScript()
	{
		return String.format("jQuery(function() { %s = new kendo.data.SchedulerDataSource(%s); });", this.getName(), this.toString());
	}
}
