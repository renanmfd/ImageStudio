/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagestudio.bases;

/**
 * @author renanmfd
 */
public class Image {
    
    private int width;
    private int height;
    
    private String filepath;
    private String filename;
    private String fileformat;
    
    private String created;
    private String updated;
    
    private int filesize;
    private int version;
    
    private Pixel[] data;
    
    // Constructors
    
    public Image() {
    }
    
    public Image(int width, int height, String filepath, String filename, String fileformat, String created, String updated, int filesize, int version, Pixel[] data) {
        this.width = width;
        this.height = height;
        this.filepath = filepath;
        this.filename = filename;
        this.fileformat = fileformat;
        this.created = created;
        this.updated = updated;
        this.filesize = filesize;
        this.version = version;
        this.data = data;
    }
    
    
    // Getters and Setters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getFilepath() {
        return filepath;
    }
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFileformat() {
        return fileformat;
    }
    public void setFileformat(String fileformat) {
        this.fileformat = fileformat;
    }

    public String getCreated() {
        return created;
    }
    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public int getFilesize() {
        return filesize;
    }
    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public Pixel[] getData() {
        return data;
    }
    public void setData(Pixel[] data) {
        this.data = data;
    }
    

}
