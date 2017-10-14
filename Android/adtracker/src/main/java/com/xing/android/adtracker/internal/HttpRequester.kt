/*
 * Copyright (C) 2017 XING SE (http://xing.com/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xing.android.adtracker.internal

import java.io.IOException
import java.net.MalformedURLException

/**
 * abstraction interface to performing the actual network request of calling the tracking endpoint
 */
interface HttpRequester {
    /**
     * perform a GET request of the given url with the additional given headers.
     * @return HTTP status code of response, or <= 0 if other failure
     */
    @Throws(MalformedURLException::class, IOException::class)
    fun get(urlString: String, headers: Map<String, String>): Int
}