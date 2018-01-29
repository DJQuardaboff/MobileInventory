package com.porterlee.mobileinventory;

public class PreloadLocationsDatabase {
    public static final String FILE_NAME = "inventory.db";
    public static final String ID = "id";
    public static final String PICTURE = "picture";
    public static final String BARCODE = "barcode";
    public static final String LOCATION_ID = "location";
    public static final String DESCRIPTION = "description";
    public static final String DATE_TIME = "datetime";

    public class ItemTable {
        public static final String NAME = "items";
        public static final String TABLE_CREATION = NAME + " ( " + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + BARCODE + " TEXT, " + LOCATION_ID + " INTEGER, " + DESCRIPTION + " TEXT, " + DATE_TIME + " BIGINT )";
        public class Keys {
            public static final String ID = NAME + '.' + InventoryDatabase.ID;
            public static final String BARCODE = NAME + '.' + InventoryDatabase.BARCODE;
            public static final String LOCATION_ID = NAME + '.' + InventoryDatabase.LOCATION_ID;
            public static final String DESCRIPTION = NAME + '.' + InventoryDatabase.DESCRIPTION;
            public static final String DATE_TIME = NAME + '.' + InventoryDatabase.DATE_TIME;
        }
    }

    public class PicturesTable {
        public static final String NAME = "pictures";
        public static final String TABLE_CREATION = NAME + " ( " + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + PICTURE + " BLOB, "+ DESCRIPTION + " TEXT, " + DATE_TIME + " BIGINT )";
        public class Keys {
            public static final String ID = NAME + '.' + InventoryDatabase.ID;
            public static final String PICTURE = NAME + '.' + InventoryDatabase.PICTURE;
            public static final String DESCRIPTION = NAME + '.' + InventoryDatabase.DESCRIPTION;
            public static final String DATE_TIME = NAME + '.' + InventoryDatabase.DATE_TIME;
        }
    }
}
