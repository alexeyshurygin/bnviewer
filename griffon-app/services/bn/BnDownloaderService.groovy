package bn

import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.client.HttpClient
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.DefaultHttpClient

class BnDownloaderService {
    static def DEFAULT_CHARSET = "windows-1251"
    static def BUFFER_SIZE = 4096

    def serviceMethod() {

    }

    def loadData() {
        HttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet("http://www.bn.ru/");
        HttpResponse response = httpclient.execute(httpget);
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            InputStream instream = entity.getContent();
            int l;
            byte[] tmp = new byte[2048];
            while ((l = instream.read(tmp)) != -1) {
            }
        }
    }

    def printStream(InputStream res) throws IOException {
        InputStreamReader reader = new InputStreamReader(new BufferedInputStream(res, BUFFER_SIZE), DEFAULT_CHARSET);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        int am;
        char[] buffer = new char[BUFFER_SIZE];
        while ((am = reader.read(buffer)) != -1)
            writer.write(buffer, 0, am);
    }
}