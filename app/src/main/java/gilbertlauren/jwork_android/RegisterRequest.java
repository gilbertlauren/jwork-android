package gilbertlauren.jwork_android;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;
/**
 * Class RegisterRequest
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class RegisterRequest extends StringRequest {
    private static final String URL = "http://192.168.1.58:8080/jobseeker/register";
    private Map<String, String> params;

    /**
     * Constructor for Register Request
     * @param name
     * @param email
     * @param password
     * @param listener
     */
    public RegisterRequest(String name, String email, String password, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("email", email);
        params.put("password", password);
    }

    /**
     * auth failure
     * @return
     * @throws AuthFailureError
     */
    @Override
    public Map<String, String> getParams() throws AuthFailureError {
        return params;
    }
}
