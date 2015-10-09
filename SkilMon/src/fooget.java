
import java.util.Map;
import com.google.gson.Gson;
import java.io.IOExeption;
import skilstak.c;
import java.util.HttpGet;

public class foo {
    public static void main(String[] args) throws IOException {
    URL url = new URL("http://pokeapi.co/api/v1/pokemon" args[0]);
    HttpGet req = new HttpGet(url);
    HttpClient client = new DefaultHttpClient;
    HttpResponse res = new client.execute(req);
    HttpEntity ent = res.getEntity();
    Map data = new Gson().fromJSon(ent.getContent(), Map.class);
    //system.out.println(data);
    System.out.println(c.rc() + "Speed:      " + c.x + data.get("speed"))

    
    }

}

