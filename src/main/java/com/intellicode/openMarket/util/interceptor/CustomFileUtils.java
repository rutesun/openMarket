package com.intellicode.openMarket.util.interceptor;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by rutes_000 on 2015-06-02.
 */
public class CustomFileUtils {

    private static String imagePath = "";
    private static final String seperate = "-";
    private static File imageFolder = null;
    static {
        imagePath = System.getProperty("user.dir") + "\\src\\main\\webapp\\resources\\productImages\\";
        imageFolder = new File(imagePath);
    }

    public static File getFileFromMultipartFile(String companyId, String productCode, MultipartFile mFile) throws IOException {
        if(!existCompanyFolder(companyId))
            makeCompanyFolder(companyId);

        File convFile = new File(imagePath + companyId  + File.separator + productCode + seperate + UUID.randomUUID().toString() + "." + getFileExtension(mFile.getOriginalFilename()));
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(mFile.getBytes());
        fos.close();
        return convFile;
    }

    private static String getFileExtension(String fileName){
        int pos = fileName.lastIndexOf( "." );
        return fileName.substring( pos + 1 );
    }

    private static File makeFile(String path, String key){
        return new File(path + key);
    }

    private static boolean existCompanyFolder(String companyId){
        File file = makeFile(imageFolder.getPath(), companyId);
        return file.exists() && file.isDirectory();
    }

    private static File makeCompanyFolder(String companyId) throws IOException {
        File file = makeFile(imageFolder.getPath(), companyId);
        file.mkdir();
        return file;
    }

    public static String getImageFileId(String companyId, String productCode, MultipartFile mFile) throws IOException {
        return CustomFileUtils.getFileFromMultipartFile(companyId, productCode, mFile).getPath().replace(imagePath, "");
    }
}
