import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaArgs;
public class SecureValues extends CordovaPlugin {

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws org.json.JSONException {
       
        callbackContext.success("Hello Dude Yogesh Bro...");
        
        return true; //To change body of generated methods, choose Tools | Templates.
    }
    
}
