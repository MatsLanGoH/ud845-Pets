package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Contract class for a table which contains data about the shelter's pets.
 */

public final class PetContract {

    // Make the constructor private to prevent accidental instantiation.
    private PetContract() {

    }

    /**
     * Inner class to define table contents.
     */
    private static class PetEntry implements BaseColumns {

        /**
         * String constants for table name and headings
         */
        public static final String TABLE_NAME = "pets";
        public static final String COLUMN_NAME_TITLE = "name";
        public static final String COLUMN_NAME_BREED = "breed";
        public static final String COLUMN_NAME_GENDER = "gender";
        public static final String COLUMN_NAME_WEIGHT = "weight";

        /**
         * Constants for gender.
         */
        public static final int GENDER_MALE = 0;
        public static final int GENDER_FEMALE = 1;
        public static final int GENDER_UNKNOWN = 2;
    }
}


