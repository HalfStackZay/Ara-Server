/*
 * Copyright (c) 2019. Fulton Browne
 *  This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

/**
 * Class used to for running update from beta testers.
 */
package com.andromeda.araserver

class Update {
    /**
     * Function used for running update from beta testers.
     * @param ver version string.
     * @return String.
     */
    fun update(ver: String): String {
        //Remove the "/update from the uri
        val ver1 = ver.removeRange(0, 8)
        //Convert version string to version double
        val vers: Double = ver1.toDouble()
        //set a link value if update
        val out: String
        out = if (vers > 0.1) "link here"
        else "nope"
        //Return the fina value
        return out
    }
}