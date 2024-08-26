/*
 * Copyright (c) 2022, WSO2 LLC. (http://www.wso2.com). All Rights Reserved.
 *
 * This software is the property of WSO2 LLC. and its suppliers, if any.
 * Dissemination of any information or reproduction of any material contained
 * herein is strictly forbidden, unless permitted by WSO2 in accordance with
 * the WSO2 Software License available at: https://wso2.com/licenses/eula/3.2
 * For specific language governing the permissions and limitations under
 * this license, please see the license as well as any agreement you’ve
 * entered into with WSO2 governing the purchase of this software and any
 * associated services.
 */
package org.wso2.carbon.googleAdNetworkconnector;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * In-Memory Token Store.
 */
public class InMemoryTokenStore implements TokenStore {

    private final Map<String, Token> TOKEN_MAP = new ConcurrentHashMap<>(2);

    @Override
    public Token get(String tokenKey) {

        return TOKEN_MAP.get(tokenKey);
    }

    @Override
    public void add(String tokenKey, Token token) {

        TOKEN_MAP.put(tokenKey, token);
    }

    @Override
    public Token remove(String tokenKey) {

        return TOKEN_MAP.remove(tokenKey);
    }

    @Override
    public void clean() {

        TOKEN_MAP.clear();
    }
}
