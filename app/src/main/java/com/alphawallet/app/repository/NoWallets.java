package com.alphawallet.app.repository;

import java.io.IOException;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class NoWallets
        extends IOException
{
    private static final long serialVersionUID = -42742762234234234L;

    /**
     * Constructs an UnsupportedEncodingException without a detail message.
     */
    public NoWallets() {
        super();
    }

    /**
     * Constructs an UnsupportedEncodingException with a detail message.
     * @param s Describes the reason for the exception.
     */
    public NoWallets(String s) {
        super(s);
    }
}