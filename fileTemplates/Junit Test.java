#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "") package ${PACKAGE_NAME};#end
#parse("File Header.java")

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertTrue;

public class ${NAME} {

    @Test
    public void test()
    {
    }
}