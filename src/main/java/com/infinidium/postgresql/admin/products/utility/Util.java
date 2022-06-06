package com.infinidium.postgresql.admin.products.utility;

public final class Util
{
    private Util() {}

    public static void showExceptionMessage(Exception e)
    {
        System.err.println(e.getClass().getSimpleName() + " is occured. " +
                "Exception message: " + e.getMessage());
    }
}
