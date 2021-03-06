package doc;

import org.junit.Test;
import org.mapdb.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

import static org.junit.Assert.assertEquals;

public class hello_world_file {

    @Test
    public void run() throws IOException {
        //a
        DB db = DBMaker.fileDB("file.db").make();
        ConcurrentMap map = db.hashMap("map").make();
        map.put("something", "here");
        db.close();
        //z
        //cleanup, not part of example
        new File("file.db").delete();
    }

}
