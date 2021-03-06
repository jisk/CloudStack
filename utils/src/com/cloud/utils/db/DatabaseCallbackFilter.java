// Copyright 2012 Citrix Systems, Inc. Licensed under the
// Apache License, Version 2.0 (the "License"); you may not use this
// file except in compliance with the License.  Citrix Systems, Inc.
// reserves all rights not expressly granted by the License.
// You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// 
// Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.utils.db;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

public class DatabaseCallbackFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        return checkAnnotation(method) ? 1 : 0;
    }
    
    public static boolean checkAnnotation(Method method) {
    	/*Check self*/
        DB db = method.getAnnotation(DB.class);
        if (db != null) {
            return db.txn();
        }
        Class<?> clazz = method.getDeclaringClass();
        
        /*Check parent method*/
        try {
	        Method pMethod = clazz.getMethod(method.getName(), method.getParameterTypes());
	        db = pMethod.getAnnotation(DB.class);
	        if (db != null) {
	            return db.txn();
	        }
        } catch (SecurityException e) {
        } catch (NoSuchMethodException e) {
        }
        
        /*Check class's annotation and ancestor's annotation*/
        do {
            db = clazz.getAnnotation(DB.class);
            if (db != null) {
                return db.txn();
            }
            clazz = clazz.getSuperclass();
        } while (clazz != Object.class && clazz != null);
        return false;
    }
}
