package com.teama.requestsubsystem;

import com.teama.Configuration;
import com.teama.requestsubsystem.data.JavaDBServiceRequestData;
import com.teama.requestsubsystem.data.ServiceRequestDataSource;

public class RequestSubsystem {
    private ServiceRequestDataSource requestDB = new JavaDBServiceRequestData(Configuration.dbURL, Configuration.requestTable);

    private static class RequestSubsystemGetter {
        private static final RequestSubsystem _instance = new RequestSubsystem();
    }

    public static RequestSubsystem getInstance() {
        return RequestSubsystemGetter._instance;
    }


    public void makeRequest(Request r) {
        requestDB.submitRequest(r);

    }

    public void fulfillRequest(String id) {
        requestDB.fulfillRequest(id);
    }
    public void submitRequest(Request req) {
        requestDB.submitRequest(req);
    }
}
