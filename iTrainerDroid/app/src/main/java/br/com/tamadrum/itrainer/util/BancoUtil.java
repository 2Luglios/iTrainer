package br.com.tamadrum.itrainer.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ettoreluglio on 07/07/17.
 */

public class BancoUtil extends SQLiteOpenHelper {

    private static final String BANCO = "iTrainer";
    private static final int VERSION = 1;

    public BancoUtil(Context context) {
        super(context, BANCO, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
