package com.redoute.datamap.service;

import com.redoute.datamap.entity.Picture;
import java.util.List;

/**
 *
 * @author bcivel
 */
public interface IPictureService {

    Picture findPictureByKey(String name);
    
    /**
     *
     * @param picture picture to insert
     */
    void createPicture(Picture picture);

    /**
     *
     * @param picture picture to delete
     */
    void deletePicture(Picture picture);

    /**
     *
     * @return All Picture
     */
    List<Picture> findAllPicture();
    
    /**
     *
     * @return All Picture
     */
    List<Picture> findPicturePerPages(String[] pages);

    /**
     *
     * @param individualSearch search term on a dedicated column of the
     * @param joinedSearch search term on join other table
     * resultSet
     * @return
     */
    List<Picture> findPictureListByCriteria(String individualSearch, String joinedSearch);
    
    /**
     * 
     * @param name Key of the table
     * @param columnName Name of the column
     * @param value New value of the columnName
     */
    void updatePicture(String name, String columnName, String value);
    
    /**
     * 
     * @param searchTerm words to be searched in every column (Exemple : article)
     * @param inds part of the script to add to where clause (Exemple : `type` = 'Article')
     * @return The number of records for these criterias
     */
    Integer getNumberOfPicturePerCrtiteria(String searchTerm, String inds);
    
    /**
     * 
     * @param colName name of the column of the picture table
     * @return List of distinct properties of this column
     */
    List<String> findDistinctValuesfromColumn (String colName);
}
