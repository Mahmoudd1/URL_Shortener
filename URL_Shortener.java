import java.util.HashMap;

public class URL_Shortener {
    // Encodes a URL to a shortened URL.
    HashMap<String,String>shortToLong=new HashMap<>(),longToShort=new HashMap<>();
    String code ="0123456789abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";
    public String encode(String longUrl) {
        if (longToShort.containsKey(longUrl))
            return longToShort.get(longUrl);
        String mycode=getcode();
        while(shortToLong.containsKey(mycode))
            mycode=getcode();
        shortToLong.put(mycode,longUrl);
        longToShort.put(longUrl,mycode);
        return mycode;
    }
    String getcode()
    {
        char[]tiny=new char[6];
        for (int i=0;i<6;i++)
        {
            tiny[i]=code.charAt((int)Math.random()*62);
        }
        return "http://tinyurl.com/" + tiny.toString();
    }
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}
