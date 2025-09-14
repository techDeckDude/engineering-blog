# Building TechDeckDude Blog

## Defining Application Purpose and Functionality

The goals of the application are simple: `build my own space on the interent where I can talk about building things on the internet;)`.

You'll need to be able to retrieve and display textual data. It would even be cool if you could like and comment.

## Designing Application Architecture

The general approach was to use cloud-native, developer friendly tools to quickly ship my app and, with the hopes of one-day amassing a large following of interested readers, be able to scale the architecture accordingly.

### Supabase: Dealing With Authentication & Authorization, API Security and Rate Limiting

### Docker: Deploying An Entire App In The Cloud Seamlessly

### Springboot: Building Standardized REST APIs With All The Bells And Whistles

### AWS: EC2, ECR, S3

## Getting Started

## Spring Initializer

I used Springboot MVC to build my REST API service to handle the CRUD operations for blog posts. 

I chose the latest stable flavor of Springboot, version 3.5.5
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.5.5</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
```

Using the `spring-boot-starter-web` dependency I was able to start building CRUD endpoints in minutes. This dependency is super useful for creating endpoints for returning html templates or just response bodies. Dealer's choice. 

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

For simplicity, I added `spring-boot-starter-thymeleaf` to create endpoints for returning html templates. This allows me to leverage server-side-rendering out of the box. 

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

## Supabase with Docker

