package com.levizheng.base.autoconfigurate;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import springfox.documentation.service.Contact;

/**
 * @author levi
 * @since 2023/01/19
 */
@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    private String title;

    private String description;

    private Contact contact;

    private String version;
}
