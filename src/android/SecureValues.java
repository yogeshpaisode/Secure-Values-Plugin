import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaArgs;
import java.util.ArrayList;
import java.util.List;
public class SecureValues extends CordovaPlugin {

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws org.json.JSONException {
        List list=new ArrayList();
        list.add("http://192.168.0.43:111/gsfapi/");
        JSONArray jSONArray=new JSONArray(list);
        callbackContext.success(jSONArray);
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
}
