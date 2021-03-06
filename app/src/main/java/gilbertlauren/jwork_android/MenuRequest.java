package gilbertlauren.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * Class MenuRequest
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class MenuRequest extends StringRequest {
    private static final String URL = "http://192.168.1.58:8080/job";
        private Map<String,String> params;

    /**
     * Constructor for MenuRequest
     * @param listener
     */
    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, URL, listener, null);
        params = new HashMap<>();
    }

    /**
     * Auth error
     * @return
     * @throws AuthFailureError
     */
    @Override
    protected Map<String,String> getParams() throws AuthFailureError {
        return params;
    }
}