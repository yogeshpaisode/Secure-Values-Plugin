
import java.util.ArrayList;
import java.util.List;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

/**
 *
 * @author yogesh
 */
public class SecureValues extends CordovaPlugin {

    @Override
    public boolean execute(String action, CordovaArgs args, CallbackContext callbackContext) throws org.json.JSONException {
        Values v = new Values();
        JSONArray jSONArray = new JSONArray(v);
        callbackContext.success(jSONArray);
        return true; //To change body of generated methods, choose Tools | Templates.
    }

}

/**
 *
 * @author yogesh
 */
class Values {

    private String gsf_appname = "GSF App Android";
    private String gsf_clientid = "7351C2CF-5EA8-415E-8DF7-E1A964292301";
    private String gsf_privatekey = "19FAA6D6-314C-4E7C-9C8F-580585989226";
    private String debug_URL = "http://192.168.0.43:111/gsfapi/";
    private String live_URL = "";

    public String getGsf_appname() {
        return gsf_appname;
    }

    public String getGsf_clientid() {
        return gsf_clientid;
    }

    public String getGsf_privatekey() {
        return gsf_privatekey;
    }

    public String getDebug_URL() {
        return debug_URL;
    }

    public String getLive_URL() {
        return live_URL;
    }

}
