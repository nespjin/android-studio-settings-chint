package ${PACKAGE_NAME};

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

#parse("File Header.java")
public class ${NAME} extends Service {
    
    private static final String TAG = "${NAME}";
    
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
