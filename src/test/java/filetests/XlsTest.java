package filetests;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XlsTest {

    @Test
    void junitXlsTest() throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("XlsTest.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(resourceAsStream);
        assertEquals("Рамзаева Русский язык. 3кл. Учебник",
                workbook.getSheetAt(0).getRow(7).getCell(1).toString(),
                "В этой ячейке должен содержаться: Рамзаева Русский язык. 3кл. Учебник");
    }
}
