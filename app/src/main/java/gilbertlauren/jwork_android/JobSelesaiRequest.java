package gilbertlauren.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * Class JobSelesaiRequest
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class JobSelesaiRequest extends StringRequest {
    private static final String URL = "http://192.168.1.58:8080/invoice/invoiceStatus/";
    private Map<String, String> params;
    private String invoiceStatus = "Finished";

    /**
     * Constructor for JobSelesaiRequest
     * @param invoiceId
     * @param listener
     */
    public JobSelesaiRequest (String invoiceId, Response.Listener<String> listener) {
        super(Method.PUT, URL+invoiceId, listener, null);
        params = new HashMap<>();
        params.put("status", invoiceStatus);
    }

    /**
     *
     * @return
     * @throws AuthFailureError
     */
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}