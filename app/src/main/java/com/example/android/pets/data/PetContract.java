package com.example.android.pets.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Contract class for a table which contains data about the shelter's pets.
 */

public final class PetContract {

    // Make the constructor private to prevent accidental instantiation.
    private PetContract() {
    }

    /** Content URI - authority */
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    /** Content URI - final content uri */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /** Content URI - table name */
    public static final String PATH_PETS = "pets";

    /**
     * Inner class to define table contents.
     */
    public static class PetEntry implements BaseColumns {

        /** Content URI - complete uri */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of pets.
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single pet.
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * String constants for table name and headings
         */
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible options for gender choice.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

        /**
         * Returns whether or not the given gender is {@link #GENDER_UNKNOWN},
         * {@link #GENDER_FEMALE}, or {@link #GENDER_MALE}.
         */
        public static boolean isValidGender(Integer gender) {
            return gender == GENDER_UNKNOWN || gender == GENDER_FEMALE || gender == GENDER_MALE;
        }
    }
}


