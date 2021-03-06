/*
 * Copyright 2019 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.throttling.ioc;

import com.hivemq.bootstrap.ioc.SingletonModule;
import io.netty.handler.traffic.GlobalTrafficShapingHandler;

import javax.inject.Singleton;

/**
 * The Guice module for all Throttling bindings
 *
 * @author Florian Limpoeck
 * @author Christoph Schäbel
 */
public class ThrottlingModule extends SingletonModule {


    public ThrottlingModule() {
        super(ThrottlingModule.class);
    }

    @Override
    protected void configure() {

        bind(GlobalTrafficShapingHandler.class).toProvider(GlobalTrafficShapingProvider.class).in(Singleton.class);
    }
}