package gq.catz.inventoryofrollingstockfinal;

import android.content.Context;

public class RollingStockManager {
    private Context context;

    public static RollingStockManager getInstance(Context context){
        return new RollingStockManager(context);

    }

    private RollingStockManager(Context context) {
        this.context = context;
    }

}
