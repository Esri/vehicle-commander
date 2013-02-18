/*******************************************************************************
 * Copyright 2012 Esri
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 ******************************************************************************/
package com.esri.vehiclecommander.analysis;

import com.esri.map.ArcGISDynamicMapServiceLayer;

/**
 * An implementation of GPListener that by default does nothing. Override
 * the methods for the events you want to receive.
 */
public abstract class GPAdapter implements GPListener {

    public void gpDisbled() {
        
    }

    public void gpEnabled() {
        
    }
    
    public void gpStarted() {
        
    }

    public void gpEnded(ArcGISDynamicMapServiceLayer resultLayer) {
        
    }
    
}