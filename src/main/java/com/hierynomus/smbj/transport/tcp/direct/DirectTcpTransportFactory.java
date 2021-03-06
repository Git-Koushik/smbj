/*
 * Copyright (C)2016 - SMBJ Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hierynomus.smbj.transport.tcp.direct;

import com.hierynomus.protocol.Packet;
import com.hierynomus.smbj.SmbConfig;
import com.hierynomus.smbj.transport.PacketHandlers;
import com.hierynomus.smbj.transport.TransportLayer;
import com.hierynomus.smbj.transport.TransportLayerFactory;

public class DirectTcpTransportFactory<P extends Packet<P, ?>> implements TransportLayerFactory<P> {
    @Override
    public TransportLayer<P> createTransportLayer(PacketHandlers<P> handlers, SmbConfig config) {
        return new DirectTcpTransport<>(config.getSocketFactory(), config.getSoTimeout(), handlers);
    }

}
