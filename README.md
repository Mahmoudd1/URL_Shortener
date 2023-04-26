# URL_Shortener

The URL_Shortener class is a Java implementation to shorten long URLs to short ones. It utilizes two HashMaps to store the long and short URLs and their corresponding keys. It provides three methods, encode(), decode(), and getcode().

<code> encode(longUrl: String): String </code>

This method takes a long URL string as input and returns a short URL string. The method first checks if the given long URL is already stored in the longToShort HashMap. If it is, it returns the corresponding short URL. Otherwise, it generates a new short URL by calling the getcode() method and stores the mapping between the long and short URLs in both HashMaps. The method then returns the generated short URL.

<code> decode(shortUrl: String): String </code>

This method takes a short URL string as input and returns the corresponding long URL string. It retrieves the long URL from the shortToLong HashMap using the given short URL key and returns it.

<code>getcode(): String</code>

This method generates a random 6-character string using a code string variable. It first creates an empty character array of length 6 and then fills it with randomly selected characters from the code string variable. It then concatenates the generated 6-character string with the prefix "http://tinyurl.com/" and returns it.

Note that the getcode() method uses the Math.random() method to generate random numbers, which may not be cryptographically secure. Therefore, it is recommended to use a secure random number generator for production use.
