package com.holdingscythe.pocketamcreader;

import android.content.ContentResolver;
import android.net.Uri;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// todo: cleanup

/**
 * Convenience definitions
 */
public final class S {
    // RELEASE: change to 6
    public static final int LOGLEVEL = 6;

    public static final boolean STRICT = LOGLEVEL == 1;
    public static final boolean VERBOSE = LOGLEVEL <= 2;
    public static final boolean DEBUG = LOGLEVEL <= 3;
    public static final boolean INFO = LOGLEVEL <= 4;
    public static final boolean WARN = LOGLEVEL <= 5;
    public static final boolean ERROR = LOGLEVEL <= 6;

    public static final String AUTHORITY = "com.holdingscythe.provider.MovieCatalog";
    public static final String TAG = "PocketAMCReader";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/movies");
    public static final String DEFAULT_FONT = "fonts/RobotoCondensed-Regular.ttf";

    // MIME types used for searching movies or looking up a single movie
    public static final String MOVIES_MIME_TYPE =
            ContentResolver.CURSOR_DIR_BASE_TYPE + "/vnd.com.holdingscythe.movies";
    public static final String MOVIE_MIME_TYPE =
            ContentResolver.CURSOR_ITEM_BASE_TYPE + "/vnd.com.holdingscythe.movie";

    // Import
    static final String CATALOG_TMP_FILENAME = "/amc_import_tmp.xml";
    public static final int IMPORT_CONVERSION_START = -1;
    public static final int IMPORT_LOADING_START = -2;
    public static final int IMPORT_INDEXING_START = -3;
    public static final int IMPORT_ERROR_CONVERSION = -10;
    public static final int IMPORT_ERROR_LOADING = -11;

    // Thumbnail settings
//    public static final double THUMB_AR = 0.71;
//    public static final int THUMB_IN_SAMPLE_SIZE = 2;

//    public final static int THEME_NORMAL = 0;
//    public final static int THEME_LARGE = 1;
//    public final static int THEME_X_LARGE = 2;
//    public final static int THEME_XX_LARGE = 3;

    // SettingsActivity requesting restart
    public static final Map<String, Integer> SETTINGS_REQUESTING_RESTART;

    static {
        Map<String, Integer> tmpMap = new HashMap<>();
        tmpMap.put("settingCatalogLocation", 1);
        tmpMap.put("settingCatalogEncoding", 1);
//        tmpMap.put("settingForceImport", 1);
//        tmpMap.put("settingFontSize", 1);
//        tmpMap.put("settingClearThumbCache", 1);
        tmpMap.put("settingShowThumbs", 1);
        SETTINGS_REQUESTING_RESTART = Collections.unmodifiableMap(tmpMap);
    }

    // SettingsActivity requesting list refresh
    public static final Map<String, Integer> SETTINGS_REQUESTING_REFRESH;

    static {
        Map<String, Integer> tmpMap = new HashMap<>();
//        tmpMap.put("settingMoviesListLine1", 1);
//        tmpMap.put("settingMoviesListLine2", 1);
//        tmpMap.put("settingMoviesListLine3", 1);
        tmpMap.put("settingListForceSortField", 1);
        tmpMap.put("settingMoviesListSeparator", 1);
//        tmpMap.put("settingShowColorTags", 1);
        SETTINGS_REQUESTING_REFRESH = Collections.unmodifiableMap(tmpMap);
    }

    // Color tags
    public static final Map<String, Integer> COLOR_TAGS;

    static {
        Map<String, Integer> tmpMap = new HashMap<>();
        tmpMap.put("0", android.R.color.transparent);
        tmpMap.put("1", R.color.color_tag_1);
        tmpMap.put("2", R.color.color_tag_2);
        tmpMap.put("3", R.color.color_tag_3);
        tmpMap.put("4", R.color.color_tag_4);
        tmpMap.put("5", R.color.color_tag_5);
        tmpMap.put("6", R.color.color_tag_6);
        tmpMap.put("7", R.color.color_tag_7);
        tmpMap.put("8", R.color.color_tag_8);
        tmpMap.put("9", R.color.color_tag_9);
        tmpMap.put("10", R.color.color_tag_10);
        tmpMap.put("11", R.color.color_tag_11);
        tmpMap.put("12", R.color.color_tag_12);
        COLOR_TAGS = Collections.unmodifiableMap(tmpMap);
    }

}
