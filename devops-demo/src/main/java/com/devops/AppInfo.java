
package com.devops;

public class AppInfo {

    public String getApplicationName() {
        return "DevOps Infrastructure Portal";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getEnvironment() {
        return "AWS EC2";
    }

    public String getServerName() {
        return System.getenv().getOrDefault(
            "HOSTNAME", "Unknown Server"
        );
    }

    public String getJavaVersion() {
        return System.getProperty("java.version");
    }

    public String getOperatingSystem() {
        return System.getProperty("os.name");
    }

    public String getStatus() {
        return "UP";
    }
}
