package com.github.kr328.ibr.remote;

import java.util.regex.Pattern;

public class Constants {
    public static final String TAG = "InternalBrowserRedirect";
    public static final String APPLICATION_ID = "com.github.kr328.ibr";

    public static final int VERSION = 5;
    public static final String DATA_STORE_DIRECTORY = "/data/misc/riru/modules/internal_browser_redirect/userdata/";
    public static final Pattern PATTERN_CONFIG_FILE = Pattern.compile("rules.([a-zA-Z.]+).json");
    public static final String TEMPLATE_CONFIG_FILE = "rules.%s.json";
    public static final int ACTIVITY_CONNECT_TRANSACT_CODE = 24519;

    public static final String SERVICE_STATUE_KEY = "sys.ibr.status";
}