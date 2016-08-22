package com.sam_chordas.android.stockhawk.AppWidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by DELL on 8/21/2016.
 */
public class StockWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StockWidgetFactory(getApplicationContext(), intent);
    }
}

