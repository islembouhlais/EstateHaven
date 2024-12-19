package project.app.demo.multimedia;

import java.sql.Timestamp;

/*
multimedia_id
title
description
upload_date
file_path
property_id
 */
public class multimediaEntity {
    // add attribute to mapper if it added here
    private String title;
    private String data;
    private MULTIMEDIA_TYPE type;
    private Timestamp upload_date;

    public String getType() {
        return type.name();
    }


    public void setType(MULTIMEDIA_TYPE type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getData() {
        return data;
    }

    public Timestamp getUpload_date() {
        return upload_date;
    }

    

    public void setTitle(String title) {
        this.title = title;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setUpload_date(Timestamp upload_date) {
        this.upload_date = upload_date;
    }

    
}
