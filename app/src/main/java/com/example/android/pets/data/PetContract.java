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
    public static class PetEntry implements BaseColumns {

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
        public static final int GENDER_MALE = 0;
        public static final int GENDER_FEMALE = 1;
        public static final int GENDER_UNKNOWN = 2;
    }
}


