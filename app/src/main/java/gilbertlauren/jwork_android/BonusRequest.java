package gilbertlauren.jwork_android;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * Class Bonus Request
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class BonusRequest extends StringRequest {
    private static final String URL = "http://192.168.1.58:8080/bonus/";
    private Map<String,String> params;

    /**
     * handle all bonus request
     * @param referralCode
     * @param listener
     */
    public BonusRequest(String referralCode, Response.Listener<String> listener) {
        super(Method.GET, URL+referralCode, listener, null);
        params = new HashMap<>();
    }

    /**
     *
     * @return
     * @throws AuthFailureError
     */
    @Override
    protected Map<String,String> getParams() throws AuthFailureError {
        return params;
    }
}