package com.dalston.dalston.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class ApplicationWebConfig : WebMvcConfigurer {
    override fun addViewControllers(registry: ViewControllerRegistry) = registry.addViewController("/").setViewName("index.html")
}