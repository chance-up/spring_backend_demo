package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "db")
public class PropertyTestConfig {

    private String host;
    private int port;
    private String logdir;
    private int timeout;

    @Override
    public String toString() {
        return "PropertyTestConfig [host=" + host + ", logdir=" + logdir + ", port=" + port + ", timeout=" + timeout
                + "]";
    }

    // public PropertyTestConfig(String host, int port, String logdir, int timeout)
    // {
    // super();
    // this.host = host;
    // this.port = port;
    // this.logdir = logdir;
    // this.timeout = timeout;
    // }

    // public String getHost() {
    // return host;
    // }

    // public void setHost(String host) {
    // this.host = host;
    // }

    // public int getPort() {
    // return port;
    // }

    // public void setPort(int port) {
    // this.port = port;
    // }

    // public String getLogdir() {
    // return logdir;
    // }

    // public void setLogdir(String logdir) {
    // this.logdir = logdir;
    // }

    // public int getTimeout() {
    // return timeout;
    // }

    // public void setTimeout(int timeout) {
    // this.timeout = timeout;
    // }
}
