package gilbertlauren.jwork_android;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * Class JobBatalRequest
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class JobBatalRequest extends StringRequest {
    private static final String URL = "http://192.168.1.58:8080/invoice/invoiceStatus/";
    private Map<String, String> params;
    private String invoiceStatus = "Cancelled";

    /**
     * Constructor JobBatalRequest
     * @param invoiceId
     * @param listener
     */
    public JobBatalRequest(String invoiceId, Response.Listener<String> listener) {
        super(Method.PUT, URL + invoiceId, listener, null);
        params = new HashMap<>();
        params.put("id", invoiceId);
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