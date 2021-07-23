package filetests;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;


public class PdfTest {

    @Test
    public void junitPdfTest() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("PdfTest.pdf");
        PDDocument pdfFile = PDDocument.load(resourceAsStream);
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        assertThat(pdfTextStripper.getText(pdfFile)).contains("Почему популярны файлы PDF?");
    }
}
