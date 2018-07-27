/*
 * Copyright (c) 2017 Komatsu Ltd. All rights reserved.
 */
package com.apibot;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.beans.factory.annotation.Value;

/**
 * Web API テスト抽象クラス。
 *
 * @version 0.0.1
 * @author G.CHEN
 */
public abstract class AbstractApiTest {

    @Value("${local.server.port}")
    private int port;

    /**
     * テスト用クライアントの取得。
     *
     * @param path URLのパス
     * @return テスト用クライアント
     */
    public WebTarget target(String path) {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:" + port);
        return target.path(path);
    }
}
