# Salesforce Fundamentals

## CRM for Lightning Experience

### Get Started with Salesforce CRM

- Describe what Salesforce is.

- Describe what CRM is.

- Describe key features of Lightning Experience.

## AppExchange Basics

### Get Started with AppExchange

### Navigate AppExchange Like a Superhero

### Install AppExchange Packages (Also Like a Superhero)

- Describe the differences between managed and unmanaged packages.

|Attribute|Managed Packages|Unmanaged Packages|
|--|--|--|
|Customization|You can’t view or change the offering’s code or metadata.|You can customize code and metadata, if desired.|
|Upgrades|The provider can automatically upgrade the offering.|To receive an upgrade, you must uninstall the package from your org and then reinstall a new version from AppExchange.|
|Org limits|The contents of the package don’t count against the app, tab, and object limits in your org.|The contents of the package count against the app, tab, and object limits in your org.|

- List key questions to ask before installing a package.
- Install a package in your org.
- Describe how to connect with other superheroes and AppExchange.

## Platform Development Basics
`Meet the tools and technologies that power development on the Salesforce platform.`

### Get Started with the Salesforce Platform
- Define the Salesforce platform.
    - The Salesforce platform is a group of technologies that supports the development of other technologies on top of it
- Describe the kinds of apps you can build with the platform.
    - Core platform lets you develop custom data models and applications for desktop and mobile
    - Heroku gives developers the power to build highly scalable web apps and back-end services using Python, Ruby, Go, and more
    - The Mobile SDK is a suite of technologies that lets you build native, HTML5, and hybrid apps that have the same reliability and security as the Salesforce app

### Develop Without Code
- Describe the benefits of the metadata-driven development model.
    - This metadata-driven development model is one of the key differences between developing on the platform and developing outside of Salesforce. Because the platform is metadata-aware, it can auto-generate a significant part of your user experience for you. Things like dialogs, record lists, detail views, and forms that you’d normally have to develop by yourself come for free. You even get all the functionality to create, read, update, and delete (affectionately referred to as CRUD) custom object records in the database.
    - All this prebuilt functionality frees up your development time to work on more sophisticated custom features. Let’s take a look at how the metadata-driven development approach works in action.
- Define and give examples of the no-code and low-code development approaches.
    - Salesforce platform encourages you to minimize code because the platform’s metadata-driven architecture lets you complete most basic development tasks without ever writing a line
    - Salesforce offers a host of tools for point-and-click—or declarative—development.

#### Quiz
- What's the relationship between objects, fields, and records and Salesforce's relational database?
    - They're a direct representation of the underlying table structure
    - Custom objects are stored in an object-oriented model while standard objects are stored in a relational model
    - **They're an abstraction of the underlying table structure**
    - They give you the ability to understand the table structure, but you don't work with them much in Salesforce
- How does the metadata-driven architecture support declarative development?
    - **It allows the platform to auto-generate basic components for your org's customizations, like dialogs and forms**
    - It inherently simplifies your org's data model
    - It gives your users access to more data than they'd have under a different architecture
    - It entirely removes the need for programmatic development in Salesforce

### Code with Salesforce Languages
There are three core programmatic technologies to learn about as a Salesforce developer.

- Lightning Component Framework: A UI development framework for desktop and mobile similar to AngularJS or React.
- Apex: Salesforce’s proprietary programming language with Java-like syntax.
- Visualforce: A markup language that lets you create custom Salesforce pages with code that looks a lot like HTML, and optionally can use a powerful combination of Apex and JavaScript.

`Describe how Visualforce is used in Lightning Experience.`

- With Lightning components, you’re developing components that can be pieced together to create pages. With Visualforce, you’re developing entire pages at once

`Outline the ways Apex is used to support Lightning components and Visualforce.`

- Lightning components use JavaScript on the client-side and Apex on the server-side. Visualforce pages can also use server-side Apex controllers, and most complex pages use quite a bit
#### Quiz
- What types of elements do you see in the XML markup for Lightning components?
    - Static HTML tags
    - JavaScript
    - Lightning component tags
    - **A and C**
- What's one situation where it's better to use Lightning Components instead of Visualforce?
    - You're building something with a JavaScript framework like AngularJS
    - **Your project will run primarily on mobile devices**
    - You're developing a single-page application
    - It's always better to use Lightning components
- What's true about Apex controllers?
    - Lightning components use client-side Apex controllers
    - Visualforce pages don't use Apex controllers
    - **Lightning components use server-side Apex controllers**
    - There is no place for Apex controllers in modern society

### Extend the Salesforce Platform

`List the Salesforce APIs.`

|API|What you can do with it|
|--|--|
|SOAP API|Integrate your org’s data with other applications using standard SOAP protocols.|
|REST API|Access objects in your org using standard REST protocols.|
|Metadata API|Manage customizations in your org and build tools that manage your metadata model.|
|Tooling API|Build custom development tools for platform applications.|
|Marketing Cloud API|Expose Marketing Cloud capabilities with the REST API and get comprehensive access to most email functionality with the SOAP API.|
|Bulk API|Load, delete, and perform asynchronous queries on large data sets.|
|Streaming API|Send and receive notifications securely and efficiently. Notifications can reflect data changes in your org, or custom events.|
|Chatter REST API|Build UI for Chatter, Communities, Recommendations, Files, Topics, and more.|
|Mobile SDK|While it’s technically a software development kit, it’s worth including here. Integrate Native or Hybrid mobile apps directly with Salesforce.|

`Explain how Heroku and Salesforce are related.`

- Heroku Connect unifies your Salesforce data with your Heroku Postgres data so you don’t have to manage moving information across platforms

`Identify ways Salesforce interacts with IoT and bots.`

#### Quiz
- For sending secure notifications, which API is your best bet?
    - MobileSDK
    - REST API
    - Chatter REST API
    - **Streaming API**
- Which Heroku service allows you to unify your Salesforce data with Postgres data?
    - Heroku Unify
    - **Heroku Connect**
    - Heroku Data Lab
    - Heroku1
- Aside from Trailhead, where is the best place to learn more about Salesforce development?
    - Salesforce Help & Training
    - Salesforce.com
    - **Salesforce Developers portal**
    - There is only Trailhead