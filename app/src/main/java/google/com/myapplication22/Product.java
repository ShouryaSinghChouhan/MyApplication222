package google.com.myapplication22;

/**
 * Created by HP on 05/12/2017.
 */
public class Product {
    int albumId;
    int id;
    private String title,shortdesc;

    private int thumbnail;



    public Product(int albumId, int id, String title, String shortdesc, int thumbnail) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;

        this.thumbnail = thumbnail;

    }

    public int getAlbumId() {
        return albumId;
    }

    public int getId() {
        return id;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setShortdesc(String shortdesc) {
        this.shortdesc = shortdesc;
    }
    public int getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }
}
