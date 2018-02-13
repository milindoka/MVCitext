package mvcitext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public class createPDF
{

	
	
	void CREATEPDF() throws FileNotFoundException, DocumentException
    { Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream("/home/milind/helloWorld.pdf"));
      document.open();
      document.add(new Paragraph("Hello World pdf!!!"));
      document.close();
    	
    }
    
	
	
}
