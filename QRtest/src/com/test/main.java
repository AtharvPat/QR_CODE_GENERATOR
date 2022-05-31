package com.test;

import com.google.zxing.pdf417.PDF417Reader;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class main
{
    public static void main(String[] args) {



        try
        {
//            PDDocument document = PDDocument.load(new File("C:\\Users\\Asus\\Downloads\\sample.pdf"));
//            PDFTextStripper pdftextdata = new PDFTextStripper();
//           String pdftextdata = pdftextdata.getText(document);

            File file=new File("C:\\Users\\Asus\\Downloads\\abc.png");



            String content = "https://lh6.googleusercontent.com/proxy/VZ7mExxxTS27fcLdVddFzJ1lSv9-ysyXoWUIJ_KHma3WtJn_BG7E9oQjSeEhj5cumuGyjcwRRTVwn742mP9R2kC02X--AAQvaqfDT1tvvknX9_pp3xVsmC7Dzj9TzG-XVW36-iLYYXfamDNiouvtcGEDxrQ12ZrFqG2pdFY0dQ=w1200-h630-p-k-no-nu";



           ByteArrayOutputStream out = QRCode.from(content).to(ImageType.PNG).stream();

            FileOutputStream fos=new FileOutputStream(file);

            fos.write(out.toByteArray());
            fos.close();

            System.out.println("success");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
