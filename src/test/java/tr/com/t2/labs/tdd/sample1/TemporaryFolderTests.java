package tr.com.t2.labs.tdd.sample1;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mertcaliskan
 * on 17/06/15.
 *
 * Demonstrates TemporaryFolder creation
 */
public class TemporaryFolderTests {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void fileCreatedAndWrittenSuccessfully() throws IOException {
        File file = tempFolder.newFile("sample.txt");
        FileUtils.writeStringToFile(file, "JUnit Rocks!");

        String line = FileUtils.readFileToString(file);
        assertThat(line, is("JUnit Rocks!"));
    }
}
