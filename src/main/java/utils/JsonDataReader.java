package utils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import managers.FileReaderManager;
import pages.SignUpDet;


public class JsonDataReader {
    private static final String customerFilePath = FileReaderManager.getInstance().getPropReader().getSignUpDetailPath() + "SignUpDet.json";

    public static SignUpDet getCustomerData() {
        Gson gson = new Gson();
        BufferedReader bufferReader;
        SignUpDet sg=null;
        try {
            bufferReader = new BufferedReader(new FileReader(customerFilePath));
            sg = gson.fromJson(bufferReader, SignUpDet.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sg;
    }
}