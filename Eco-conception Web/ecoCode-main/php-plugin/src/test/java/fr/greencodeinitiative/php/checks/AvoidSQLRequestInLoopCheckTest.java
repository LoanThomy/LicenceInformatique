package fr.greencodeinitiative.php.checks;

import java.io.File;

import org.junit.Test;
import org.sonar.plugins.php.api.tests.PHPCheckTest;
import org.sonar.plugins.php.api.tests.PhpTestFile;

public class AvoidSQLRequestInLoopCheckTest {

    @Test
    public void test() throws Exception {
        PHPCheckTest.check(new AvoidSQLRequestInLoopCheck(), new PhpTestFile(new File("src/test/resources/checks/AvoidSQLRequestInLoop.php")));
    }
}
