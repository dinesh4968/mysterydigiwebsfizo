package com.alphawallet.app.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class ActivityMeta
{
    protected final long timeStamp;
    public final String hash;

    public ActivityMeta(long ts, String txHash)
    {
        timeStamp = ts * 1000;
        hash = txHash;
    }

    public ActivityMeta(long ts, String txHash, boolean tokenTransfer)
    {
        timeStamp = ts;
        hash = txHash;
    }

    public long getTimeStampSeconds()
    {
        return timeStamp / 1000;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }
}
