/*
 * Copyright (C) 2015 Cagri Cetin (cagricetin@mail.usf.edu), University of South Florida
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
package edu.usf.cutr.trackerlib.tracker.batch;

public class BatchUpdateConstants {

    public static final int BATCH_PROCESS_REQUEST_CODE = 1234;
    public static final String BATCH_UPDATE_TIME = "batchUpdateTime";

    /**
     * Location decimate tolerance in meters
     * Used to ignore reporting close location points
     */
        public static final double TRACK_DISTANCE_THRESHOLD = 10;
}
