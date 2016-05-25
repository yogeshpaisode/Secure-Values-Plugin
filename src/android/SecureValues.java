import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaArgs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
public class SecureValues extends CordovaPlugin {

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws org.json.JSONException {
        values v=new values();
        JSONArray jSONArray=new JSONArray(v);
        callbackContext.success(jSONArray);
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
}
