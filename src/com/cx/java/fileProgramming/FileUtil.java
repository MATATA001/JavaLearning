package com.cx.java.fileProgramming;

import java.io.*;

public class FileUtil {

    /**
     * read file by bytes[]
     */
    public static byte[] readFileByBytes(String fileName) {
        File file = new File(fileName);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (InputStream in = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(in)
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out.toByteArray();
    }

    /**
     * read chinese from file to String
     */
    public static String readToString(String filePath) throws FileNotFoundException, UnsupportedEncodingException {
        String textRs = "";
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
        String lineTxt = null;
        try {
            while ((lineTxt = reader.readLine()) != null) {
                stringBuffer.append(lineTxt);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        textRs = stringBuffer.toString();
        return textRs;
    }

    /**
     * write bytes[] to file
     */
    public static boolean writeFileBytes(String filepath, byte[] content) {
        try (OutputStream fos = new FileOutputStream(
                filepath); BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    public static void main(String[] args){
    }
}
