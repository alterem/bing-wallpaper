package top.alterem.wallpaper;

import java.io.Serializable;
import java.util.Objects;

public class Image implements Serializable {

    private static final String largeUrl = "%s&w=960";

    private String date;
    private String desc;
    private String url;

    public Image() {
    }

    public Image(String date, String desc, String url) {
        this.date = date;
        this.desc = desc;
        this.url = url;
    }

    @Override
    public String toString() {
        String url = this.url + "&pid=hp&w=384&h=216&rs=1&c=4";
        return String.format("![%s](%s) %s [download 4k](%s)", this.desc, url, this.date, this.url);
    }

    /**
     * Returns a formatted large URL.
     * This method takes the value of the instance variable "url" and formats it as a large URL.
     *
     * @return the formatted large URL
     */
    public String largeUrl() {
        return String.format(largeUrl, this.url);
    }

    /**
     * Returns a markdown formatted string.
     * This method takes the values of the instance variables "date", "desc" and "url"
     * and formats them as a markdown string.
     *
     * @return the markdown formatted string
     */
    public String markdown() {
        return String.format("%s | [%s](%s)", this.date, this.desc, this.url) + System.lineSeparator() + System.lineSeparator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(date, image.date) && Objects.equals(desc, image.desc) && Objects.equals(url, image.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, desc, url);
    }

    public String getDesc() {
        return desc;
    }


    public String getUrl() {
        return url;
    }

}
