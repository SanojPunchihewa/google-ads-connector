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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The TokenManager holds and manages the tokens.
 */
public class TokenManager {
    private static final Log log = LogFactory.getLog(TokenManager.class);
    private static final TokenStore TOKEN_STORE = new InMemoryTokenStore();

    private TokenManager() {

    }

    /**
     * Function to add access token for given client ID and token endpoint.
     */
    public static void addToken(String clientId, String resourceKey, Token token) {

        String tokenKey = clientId + Constants.TOKEN_KEY_SEPARATOR + resourceKey;
        TOKEN_STORE.add(tokenKey, token);
    }

    /**
     * Function to get access token for given client ID and token endpoint.
     */
    public static Token getToken(String clientId, String resourceKey) {

        String tokenKey = clientId + Constants.TOKEN_KEY_SEPARATOR + resourceKey;
        return TOKEN_STORE.get(tokenKey);
    }

    /**
     * Function to remove token from the token cache.
     */
    public static void removeToken(String clientId, String resourceKey) {

        String tokenKey = clientId + Constants.TOKEN_KEY_SEPARATOR + resourceKey;
        TOKEN_STORE.remove(tokenKey);
    }

    /**
     * Clean all access tokens from the token cache.
     */
    public static void clean() {

        TOKEN_STORE.clean();
        if (log.isDebugEnabled()) {
            log.debug("Token map cleaned.");
        }
    }
}
