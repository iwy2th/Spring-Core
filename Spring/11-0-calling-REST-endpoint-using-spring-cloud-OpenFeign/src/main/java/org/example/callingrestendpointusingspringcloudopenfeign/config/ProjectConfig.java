package org.example.callingrestendpointusingspringcloudopenfeign.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.example.callingrestendpointusingspringcloudopenfeign.proxy")
public class ProjectConfig {
}
