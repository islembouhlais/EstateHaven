package project.app.demo.multimedia;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import project.app.demo.property.propertyEntity;


@Repository
public class multimediaRepository {

    private final JdbcTemplate jdbcTemplate;

    public multimediaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

/*
multimedia_id
title
description
upload_date
file_path
property_id
 */
    public void add_multimedia(multimediaEntity multimedia, propertyEntity property){
        String sql="INSERT INTO multimedia (title,description,upload_date,type,property_id) values(?,?,?,?,?)";
        try {

            jdbcTemplate.update(
                    sql,
                    multimedia.getTitle(),
                    multimedia.getData(),
                    multimedia.getUpload_date(),
                    multimedia.getType(),
                    property.getProperty_id()
            );

        } catch (DataAccessException e) {
            throw new RuntimeException("Error inserting seller-specific data", e);
        }
    }
}
