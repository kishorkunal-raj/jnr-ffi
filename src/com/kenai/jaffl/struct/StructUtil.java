/* 
 * Copyright (C) 2008 Wayne Meissner
 * 
 * This file is part of jffi.
 *
 * This code is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU Lesser General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or 
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License 
 * version 3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with this work.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.kenai.jaffl.struct;

import com.kenai.jaffl.MemoryIO;

/**
 *
 */
public final class StructUtil {
    private StructUtil() {}
    public final static MemoryIO getMemoryIO(Struct struct) {
        return struct.__info.getMemoryIO(0);
    }
    public final static MemoryIO getMemoryIO(Struct struct, int flags) {
        return struct.__info.getMemoryIO(flags);
    }
    public final static int getSize(Struct struct) {
        return struct.__info.size();
    }
}
