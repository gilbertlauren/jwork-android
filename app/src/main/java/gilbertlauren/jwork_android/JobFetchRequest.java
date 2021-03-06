package gilbertlauren.jwork_android;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * Class JobFetchRequest
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class JobFetchRequest extends StringRequest {
    private static final String URL = "http://192.168.1.58:8080/invoice/jobseeker/";
    private Map<String,String> params;

    /**
     * Constructor JobFetchRequest
     * @param jobseekerId
     * @param listener
     */
    public JobFetchRequest(String jobseekerId, Response.Listener<String> listener) {
        super(Method.GET, URL+jobseekerId, listener, null);
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
