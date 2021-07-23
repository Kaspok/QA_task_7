package filetests;


import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class WordTest {

    @Test
    void junitWordTest() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("TestWord.docx");
        XWPFDocument docFile = new XWPFDocument(resourceAsStream);
        assertThat(docFile.getDocument().toString()).contains("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc ac faucibus odio.");
    }
}
