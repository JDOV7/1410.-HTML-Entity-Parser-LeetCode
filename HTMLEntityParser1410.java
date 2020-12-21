package leetcode;

public class HTMLEntityParser1410 {

    public void HTMLEntityParser1410() {
        String text = "&amp;gt;";
        text = text.replace("&apos;", "'");
        text = text.replace("&amp;", "&.|.");
        text = text.replace("&gt;", ">");
        text = text.replace("&lt;", "<");
        text = text.replace("&frasl;", "/");
        text = text.replace(".|.", "");
        StringBuffer sReturnText = new StringBuffer(text);
        while (sReturnText.indexOf("&quot") != -1) {
            StringBuffer s = new StringBuffer();
            s.append('"');
            sReturnText.replace(sReturnText.indexOf("&quot"), sReturnText.indexOf("&quot") + 6, s.toString());
        }
        System.out.println(sReturnText.toString());
    }
}
