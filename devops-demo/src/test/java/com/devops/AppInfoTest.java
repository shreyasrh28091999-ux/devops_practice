
package com.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppInfoTest {

    private final AppInfo appInfo = new AppInfo();

    @Test
    void testApplicationName() {
        assertEquals(
            "DevOps Infrastructure Portal",
            appInfo.getApplicationName()
        );
    }

    @Test
    void testVersion() {
        assertEquals("1.0", appInfo.getVersion());
    }

    @Test
    void testEnvironment() {
        assertEquals("AWS EC2", appInfo.getEnvironment());
    }

    @Test
    void testServerName() {
        assertNotNull(appInfo.getServerName());
    }

    @Test
    void testJavaVersion() {
        assertNotNull(appInfo.getJavaVersion());
    }

    @Test
    void testStatus() {
        assertEquals("UP", appInfo.getStatus());
    }
}
