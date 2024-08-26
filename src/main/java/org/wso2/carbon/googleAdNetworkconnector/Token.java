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
package org.wso2.healthcare.integration.common.ehr.auth;

/**
 * The Token object holds the access token information.
 */
public class Token {

    private final String accessToken;
    private final Long createTimestamp;
    private final Long expireIn;

    public Token(String accessToken, Long createTimestamp, Long expireIn) {

        this.accessToken = accessToken;
        this.createTimestamp = createTimestamp;
        this.expireIn = expireIn;
    }

    public String getAccessToken() {

        return accessToken;
    }

    public Long getExpireIn() {

        return expireIn;
    }

    public Long getCreateTimestamp() {

        return createTimestamp;
    }

    public boolean isActive() {

        long curTimeInMillis = System.currentTimeMillis();
        return (curTimeInMillis - createTimestamp) < expireIn;
    }

    @Override
    public String toString() {

        return "Token{" + "accessToken='" + accessToken + '\'' + ", createTimestamp=" + createTimestamp + ", expireIn="
                + expireIn + '}';
    }
}
