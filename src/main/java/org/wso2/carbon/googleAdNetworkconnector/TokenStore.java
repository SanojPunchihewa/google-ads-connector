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

/**
 * Interface of Token Store.
 */
public interface TokenStore {
    /**
     * Function to get token.
     */
    Token get(String tokenKey);

    /**
     * Function to add token to the store.
     */
    void add(String tokenKey, Token token);

    /**
     * Function to remove token from the store.
     */
    Token remove(String tokenKey);

    /**
     * Function to clean token store.
     */
    void clean();
}
