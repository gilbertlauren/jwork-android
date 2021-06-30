package gilbertlauren.jwork_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * Class SelesaiJobActivity
 *
 * @author Gilbert Lauren
 * @version 6/28/2021
 */
public class SelesaiJobActivity extends AppCompatActivity {
    //variable initiate
    private static int jobseekerId;
    private int invoiceId;
    private String date;
    private String paymentType;
    private String refcode;
    private int totalFee;
    private String jobseekerName;
    private String jobName;
    private int jobFee;
    private String invoiceStatus;
    private TextView judul;
    private TextView staticJobseekerName;
    private TextView staticInvoiceDate;
    private TextView staticPayment;
    private TextView staticInvoiceStatus;
    private TextView staticRefCode;
    private TextView staticJobNameSelesai;
    private TextView staticTotalFee;

    private TextView jobseeker_name;
    private TextView invoice_date;
    private TextView payment_type;
    private TextView invoice_status;
    private TextView tvreferralcode;
    private TextView job_name_selesai;
    private TextView fee_selesai;
    private TextView total_fee_selesai;
    private ImageView lines;
    private Button btnCancel;
    private Button btnFinish;
    private TextView staticJobFee;
    //oncreate function
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //search layout components by Id and store it in variables and make it GONE
        setContentView(R.layout.activity_selesai_job);

        judul = findViewById(R.id.invoice_id);
        staticJobseekerName = findViewById(R.id.staticjobseekerName);
        staticInvoiceDate= findViewById(R.id.staticinvdate);
        staticPayment = findViewById(R.id.staticpaymenttype);
        staticInvoiceStatus = findViewById(R.id.staticinvstat);
        staticRefCode = findViewById(R.id.staticrefferalcode);
        staticJobNameSelesai = findViewById(R.id.staticfinishjobname);
        staticTotalFee = findViewById(R.id.statictf);
        staticJobFee = findViewById(R.id.staticjobfee);
        jobseeker_name = findViewById(R.id.jobseekername);
        invoice_date= findViewById(R.id.invdate);
        payment_type = findViewById(R.id.paymenttype);
        invoice_status = findViewById(R.id.invstat);
        tvreferralcode = findViewById(R.id.tvreferralcode);
        job_name_selesai = findViewById(R.id.finishjobname);
        fee_selesai = findViewById(R.id.finishfee);
        total_fee_selesai = findViewById(R.id.finishtotalfee);
        //lines = findViewById(R.id.lineslsjb);
        btnCancel = findViewById(R.id.btnCancel);
        btnFinish = findViewById(R.id.btnFinish);
        judul.setVisibility(View.GONE);
        staticJobseekerName.setVisibility(View.GONE);
        staticInvoiceDate.setVisibility(View.GONE);
        staticPayment.setVisibility(View.GONE);
        staticInvoiceStatus.setVisibility(View.GONE);
        staticRefCode.setVisibility(View.GONE);
        staticRefCode.setVisibility(View.GONE);
        staticJobNameSelesai.setVisibility(View.GONE);
        staticTotalFee.setVisibility(View.GONE);
        jobseeker_name.setVisibility(View.GONE);
        invoice_date.setVisibility(View.GONE);
        payment_type.setVisibility(View.GONE);
        invoice_status.setVisibility(View.GONE);
        tvreferralcode.setVisibility(View.GONE);
        job_name_selesai.setVisibility(View.GONE);
        fee_selesai.setVisibility(View.GONE);
        staticJobFee.setVisibility(View.GONE);
        total_fee_selesai.setVisibility(View.GONE);
        btnCancel.setVisibility(View.GONE);
        btnFinish.setVisibility(View.GONE);
        //lines.setVisibility(View.GONE);
        Bundle extras = getIntent().getExtras();
        if(extras!=null) {
            jobseekerId = extras.getInt("jobseekerId");
        }

        //initial component visibility

        fetchJob();
        initButtons();
    }
    //fetch job function
    private void fetchJob(){
        final Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.isEmpty()) {
                    Toast.makeText(SelesaiJobActivity.this, "No job applied!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(SelesaiJobActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    //if there is object make all componets visible
                    judul.setVisibility(View.VISIBLE);
                    staticJobseekerName.setVisibility(View.VISIBLE);
                    staticInvoiceDate.setVisibility(View.VISIBLE);
                    staticPayment.setVisibility(View.VISIBLE);
                    staticInvoiceStatus.setVisibility(View.VISIBLE);
                    staticRefCode.setVisibility(View.VISIBLE);
                    staticRefCode.setVisibility(View.VISIBLE);
                    staticJobNameSelesai.setVisibility(View.VISIBLE);
                    staticTotalFee.setVisibility(View.VISIBLE);
                    jobseeker_name.setVisibility(View.VISIBLE);
                    invoice_date.setVisibility(View.VISIBLE);
                    payment_type.setVisibility(View.VISIBLE);
                    staticJobFee.setVisibility(View.VISIBLE);
                    invoice_status.setVisibility(View.VISIBLE);
                    tvreferralcode.setVisibility(View.VISIBLE);
                    job_name_selesai.setVisibility(View.VISIBLE);
                    fee_selesai.setVisibility(View.VISIBLE);
                    total_fee_selesai.setVisibility(View.VISIBLE);
                    btnCancel.setVisibility(View.VISIBLE);
                    btnFinish.setVisibility(View.VISIBLE);
                }

                try {
                    //Invoice in Json Array and Object
                    JSONArray jsonResponse = new JSONArray(response);
                    for (int i=0; i<jsonResponse.length(); i++) {
                        JSONObject jsonInvoice = jsonResponse.getJSONObject(i);
                        invoiceStatus = jsonInvoice.getString("invoiceStatus");
                        invoiceId = jsonInvoice.getInt("id");
                        date = jsonInvoice.getString("date");
                        paymentType = jsonInvoice.getString("paymentType");
                        totalFee = jsonInvoice.getInt ("totalFee");
                        if (paymentType.equals("EwalletPayment")){
                            JSONObject jsonRef = jsonInvoice.getJSONObject("bonus");
                            refcode = jsonRef.getString("referralCode");
                            tvreferralcode.setText(refcode);
                        }
                        else{
                            tvreferralcode.setText("No Refferral Code");
                        }
                        judul.setText(String.valueOf(invoiceId));
                        invoice_date.setText(date.substring(0,10));
                        payment_type.setText(paymentType);
                        total_fee_selesai.setText(String.valueOf(totalFee));
                        invoice_status.setText(invoiceStatus);
                        JSONObject jsonREC = jsonInvoice.getJSONObject("jobseeker");
                        jobseekerName = jsonREC.getString("name");
                        jobseeker_name.setText(jobseekerName);

                        JSONArray jsonJobs = jsonInvoice.getJSONArray("jobs");
                        for (int j=0; j<jsonJobs.length(); j++) {
                            JSONObject jsonJobObj = jsonJobs.getJSONObject(j);
                            jobName = jsonJobObj.getString("name");
                            job_name_selesai.setText(jobName);

                            jobFee = jsonJobObj.getInt("fee");
                            fee_selesai.setText(String.valueOf(jobFee));
                        }
                    }
                }

                catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };

        JobFetchRequest fetchRequest = new JobFetchRequest(String.valueOf(jobseekerId), responseListener);
        RequestQueue queue = Volley.newRequestQueue(SelesaiJobActivity.this);
        queue.add(fetchRequest);
    }
    //cancel button
    private void initButtons(){
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Response.Listener<String> cancelListener = new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Intent intent = new Intent(SelesaiJobActivity.this, MainActivity.class);
                            startActivity(intent);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                Toast.makeText(SelesaiJobActivity.this, "Job Cancelled", Toast.LENGTH_LONG).show();
                JobBatalRequest batalRequest = new JobBatalRequest(String.valueOf(invoiceId), cancelListener);
                RequestQueue queue = Volley.newRequestQueue(SelesaiJobActivity.this);
                queue.add(batalRequest);
            }
        });
        //finish button
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Response.Listener<String> doneListener = new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            finish();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Toast.makeText(SelesaiJobActivity.this, "Job Finished", Toast.LENGTH_LONG).show();
                    }
                };
                JobSelesaiRequest selesaiRequest = new JobSelesaiRequest(String.valueOf(invoiceId), doneListener);
                RequestQueue queue = Volley.newRequestQueue(SelesaiJobActivity.this);
                queue.add(selesaiRequest);
            }
        });
    }
}