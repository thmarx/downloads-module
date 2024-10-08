package com.condation.cms.modules.downloads.counter;

/*-
 * #%L
 * downloads-module
 * %%
 * Copyright (C) 2024 CondationCMS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import java.time.LocalDate;

/**
 *
 * @author marx
 */
public interface CounterDB extends AutoCloseable {

	void clear(final String download);

	void count(final String download, final String counter, final LocalDate date, final long increment);

	long getCountAll (final String download, final String counter);
	
	long getCountCurrentDay (final String download, final String counter);
	
	long getCountCurrentMonth (final String download, final String counter);
	
	long getCountCurrentYear (final String download, final String counter);
}
