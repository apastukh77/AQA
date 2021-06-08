package logic.factory2;

import java.io.*;

public class TxtBinaryWriter extends AbstractWriter{
    @Override
    public void writeText(String text, File file) throws IOException {
        System.out.println("TxtBinaryWriter");
        OutputStream os = new FileOutputStream(file);
        byte[] buffer = text.getBytes();
        int i = 0;
        while(i< buffer.length){
            os.write(buffer[i]);
            i++;
        }
        os.flush();
        os.close();
    }
}
