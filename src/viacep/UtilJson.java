package viacep;

import java.io.BufferedReader;
import java.io.IOException;

public class UtilJson {
    public static String converteJsonEmString(BufferedReader bufferedReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = bufferedReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}
