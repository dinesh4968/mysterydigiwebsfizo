package com.alphawallet.app.ui.widget.entity;

import com.alphawallet.app.entity.BackupTokenCallback;
import com.alphawallet.app.entity.Wallet;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class WarningData
{
    public String title;
    public String detail;
    public String buttonText;
    public Wallet wallet;
    public int colour;
    public int buttonColour;
    public final BackupTokenCallback callback;

    public WarningData(BackupTokenCallback tCallback)
    {
        callback = tCallback;
    }
}
