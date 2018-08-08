package uniandes.dvanegas.dji_test;

import android.app.Application;
import android.content.Context;
import com.secneo.sdk.Helper;
public class MApplication extends Application {

    private DJIDemoApplication demoApplication;


    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);

    }
}