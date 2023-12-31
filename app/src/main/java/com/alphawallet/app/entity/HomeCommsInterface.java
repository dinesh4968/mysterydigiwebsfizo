package com.alphawallet.app.entity;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface HomeCommsInterface
{
    void downloadReady(String ready);
    void requestNotificationPermission();
    void backupSuccess(String keyAddress);
    void changeCurrency();
    void resetTokens();
    void changedLocale();
    void resetTransactions();
    void openWalletConnect(String sessionId);
}
