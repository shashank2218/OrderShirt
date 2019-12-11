package managers;

import utils.JsonDataReader;
import utils.PropReader;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager = new FileReaderManager();
    private static PropReader propReader;
    private static JsonDataReader jsonDataReader;

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public static PropReader getPropReader() {
        if (propReader == null)
            return new PropReader();
        return propReader;
    }

    public JsonDataReader getJsonReader(){
        return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
    }
}
